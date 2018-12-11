package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPrintOrder {

    public static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
        map.put("ITEC4860","Software Projects");
        map.put("ITEC3150","Advanced Programming");
        map.put("ITEC4620","Software Testing QA");
        for (String key: map.keySet() ) {
            System.out.println( key + " : " + map.get(key));
        }
    } }
