package com.company;

public class BankAccount {

    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized boolean add(int amount) {
        while(balance > 1000000) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        //notifyAll();
        return true;
    }

    public synchronized boolean remove(int amount) {
        while(balance < 100000) {
            try {
                wait();
            } catch(InterruptedException e) {

            }
        }
        balance -= amount;
        //notifyAll();
        return true;
    }

    @Override
    public String toString() {
        return this.name + " " + this.balance;
    }

    public static void main(String[] args) {
        // create two threads that add / removes random(1,100) dollars
        BankAccount account = new BankAccount("dr.im",1000);
        Thread t1 = new Thread( () -> {
            while(true) {
                account.add(1);
            }
        });
        t1.start();
        Thread t2 = new Thread( () -> {
            while(true) {
                account.remove(1);
            }
        });
        t2.start();
        Thread t3 = new Thread( () -> {
            while(true) {
                account.remove(1000);
            }
        });
        t3.start();
        while(true) {
            //try {
            //    Thread.sleep(2000);
            //} catch(InterruptedException e) {}
            System.out.println(account);
        }
    }
}
