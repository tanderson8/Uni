package com.company;

public class Reader implements Runnable {

    private SharedResource r;
    public Reader(SharedResource r) {
       this.r = r;
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            } catch(Exception e) {
            }
            r.read();
        }
    }
}
