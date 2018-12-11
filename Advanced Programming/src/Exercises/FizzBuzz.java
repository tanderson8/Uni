package com.company;

public class FizzBuzz {

    private int start;
    private int end;

    public FizzBuzz(int start, int end) {
       this.start = start;
       this.end = end;
    }

    public void count() {
        for(int i = start; i<= end; i++) {
            if ( i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

