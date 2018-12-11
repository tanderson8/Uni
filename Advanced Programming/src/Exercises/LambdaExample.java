package com.company;

import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<String>();
        lines.add("line 1");
        lines.add("line 2");
        lines.add("");
        lines.add("line 4");
        lines.add("");
        lines.add("line 5");
        lines.add("");
        System.out.println(lines);
        //lines.removeIf(  e -> e.equals("") );
        lines.replaceAll( e -> "// " + e);
        System.out.println(lines);
    }
}
