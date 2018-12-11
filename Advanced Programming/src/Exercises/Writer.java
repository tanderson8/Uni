package com.company;

public class Writer implements Runnable {

    private SharedResource r;

    public Writer(SharedResource r) {
        this.r = r;
    }

    @Override
    public void run() {
       while(true) {
           try {
               Thread.sleep(200);
           } catch(Exception e) {
               r.write();
           }
       }
    }
}
