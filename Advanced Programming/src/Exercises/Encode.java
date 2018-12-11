package com.company;

public class Encode {

    public static void main(String[] args) {
        System.out.println(encode("abc"));
    }

    public static String encode(String str) {
        if(str.length() == 0) return "";
        char current = str.charAt(0);
        String encoded = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if( i < str.length()-1 && current == str.charAt(i+1) ) {
                count += 1;
            } else {
                encoded = encoded + current + count;
                count = 1;
                if(i < str.length() - 1) {
                    current = str.charAt(i + 1);
                }
            }
        }
        return encoded;
    }
}
