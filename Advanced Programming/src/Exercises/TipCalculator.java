package com.company;

import java.io.File;
import java.util.Scanner;

public class TipCalculator {

    private double amount;
    private double tipPercent;
    private double taxPercent;

    public TipCalculator(double amount, double tipPercent, double taxPercent) {
        this.amount = amount;
        this.taxPercent = taxPercent;
        this.tipPercent = tipPercent;
    }

    public void readFile() throws Exception {
        File file = new File("res/poem.txt");
        Scanner scanner = new Scanner(file);
        while( scanner.hasNextLine() ) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void calculateTotalBill() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter amount: ");
        String amount = keyboard.next();
        double total = Double.parseDouble(amount);
        double bill = total + total*0.06 + total*0.2;
        System.out.println("Your total bill is " + bill);
    }
}
