package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {

    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<String>();
       names.add("lisa");
       names.add("bart");
       names.add("homer");
       System.out.println(reverseStrings(names));
       String str = "alphabet";
       String str2 = "mississippi";
       System.out.println(firstUnqiueChar(str));
       System.out.println(firstUnqiueChar(str2));
    }

    public static int numOfUniqueName(ArrayList<String> names) {
        HashSet<String> set = new HashSet<String>();
        for (String name: names) {
           set.add(name);
        }
        return set.size();
    }

    public static char firstUnqiueChar(String str) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),count+1);
            }
        }
        for(int i=0; i<str.length(); i++) {
            if( map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return str.charAt(0);
    }



    public static void printNums() {
        int i = 10000;
        while( i >= 0) {
            System.out.println(i);
            i -= 10;
        }
    }
    public static ArrayList<String> reverseStrings(ArrayList<String> names) {
        ArrayList<String> r = new ArrayList<String>();
        for (int i = names.size()-1; i >= 0; i--) {
           r.add(names.get(i));
        }
        return r;
    }

}
