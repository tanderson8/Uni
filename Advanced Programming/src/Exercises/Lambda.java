package com.company;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(nums);
        nums.forEach( x -> System.out.println(x + " is a cool number"));

        nums.removeIf( x -> x%2==1 );
        System.out.println(nums);
    }
}
