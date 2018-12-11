package com.company;

import java.util.ArrayList;

public class Pascal {

    public static void main(String[] args) {
        printPascal(5);
    }

    /**
     * determines what proportion of the students are * upper class. Upper class is indicated by 'U'.
     *
     * @param student the array of students where 'U' * is for upper class and 'L' is for lower class. * @returns the ratio of upper class students to
     *                <p>
     *                the total number of students.
     */
    public static double getProportionUpper(char[] student) {
        int total = student.length;
        double countUpper = 0;
        for (int i = 0; i < student.length; i++) {
           if(student[i] == 'U') {
               countUpper += 1;
           }
        }
        return countUpper/total;
    }

    /**
     * determines the difference between the highest and lowest SAT score
     *
     * @param score the SAT scores of entering students
     * @returns the non-negative difference between the highest and lowest score
     */
    public static int getDiversityMeasure(int[] score) {
        return getMax(score) - getMin(score);
    }

    private static int getMax(int[] score) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
    }

    private static int getMin(int[] score) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
            }
        }
        return min;
    }

    public static void printPascal(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nums.add(1);
                System.out.println(nums);
                continue;
            }
            if (i == 1) {
                nums.add(1);
                System.out.println(nums);
                continue;
            }
            ArrayList<Integer> newNums = new ArrayList<Integer>();
            newNums.add(1);
            for (int j = 0; j < nums.size() - 1; j++) {
                newNums.add(nums.get(j) + nums.get(j + 1));
            }
            newNums.add(1);
            System.out.println(newNums);
            nums = newNums;
        }
    }
}
