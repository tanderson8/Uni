package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class BruteForce {

    public static void main(String[] args) {
        measureTime(1000);
        measureTime(2000);
    }

    private static void measureTime(int num) {
        int [] nums = generateArray(num);
        long start = System.currentTimeMillis();
        System.out.println(maxProductOfTwo(nums));
        long end = System.currentTimeMillis();
        System.out.println("It took " + (end-start));
    }

    private static int[] generateArray(int num) {
        Random r = new Random();
        int [] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = r.nextInt();
        }
        return nums;
    }

    public static int maxProductOfTwo(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                pq.add(nums[i] * nums[j]);
            }
        }
        return pq.peek();
    }
}
