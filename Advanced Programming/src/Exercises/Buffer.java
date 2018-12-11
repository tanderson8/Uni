package com.company;

import java.util.Random;

public class Buffer {
    private final int BUFFER_SIZE = 8;
    private int[] nums = new int[BUFFER_SIZE];
    private int index = 0;
    private Random r;

    public Buffer() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt() % 100;
        }
    }

    public synchronized void add() {
       while(index > BUFFER_SIZE - 1) {
           try {
               wait();
           } catch(InterruptedException e) {}
       }
       nums[index++] = r.nextInt() % 100;
       notifyAll();
    }

    public synchronized int remove() {

        while(index < 0) {
            try {
                wait();
            } catch(InterruptedException e) {}
        }
        int value = nums[index--];
        notifyAll();
        return value;
    }
}
