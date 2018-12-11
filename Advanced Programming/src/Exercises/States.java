package com.company;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class States {

    public static void main(String[] args) throws Exception {
        File file = new File("res/states.txt");
        Scanner scanner = new Scanner(file);
        HashMap<String,String> states = new HashMap<String,String>();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] words = line.split(",");
            states.put(words[1],words[0]);
        }
        System.out.println("There are " + states.size() + " states");
        System.out.println("GA is " + states.get("GA"));
        scanner.close();
        System.out.println( "GA".hashCode() );
    }
}
