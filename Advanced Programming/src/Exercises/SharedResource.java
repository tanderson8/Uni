package com.company;

public class SharedResource {

    private int x;
    private int y;

    public SharedResource(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public synchronized void write() {
        this.x = 1;
        this.y = 2;
        System.out.println("x is " + x + "," + "y is " + y);
    }

    public synchronized void read() {
        System.out.println("x is " + x + "," + "y is " + y);
        this.x = 3;
        this.y = 4;

    }

    public static void main(String[] args) {
       SharedResource r = new SharedResource(0,0);
       //Reader read = new Reader(r);
       //Reader read2 = new Reader(r);
       Writer write = new Writer(r);
       //Writer write2 = new Writer(r);

       //Thread t1 = new Thread(read);
       Thread t2 = new Thread(write);
       //Thread t3 = new Thread(read2);
       //Thread t4 = new Thread(write2);
       t2.start();
    }
}
