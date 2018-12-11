package com.company;

public class Main {

    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "x" + j + "=" + i * j + ", ");
            }
            System.out.println();
        }
    }

    public boolean isEven(int num) {
        //return num % 2 == 0;
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }


}
