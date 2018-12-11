package com.company;

import java.util.Arrays;
import java.util.List;

public class LambdaBeCareful {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.removeIf( x -> x % 2 == 0);
    }
}
