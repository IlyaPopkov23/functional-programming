package com.itrexgroup.funcdataprocessing;

import java.util.stream.LongStream;

public class SummOfOddNumbers {
    /*  Write a method for calculating the sum of odd numbers in the given interval (inclusively) using Stream API. */

    public static void main(String[] args) {
        System.out.println(sumOfOddNumbersInRange(5, 100));
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(x -> x % 2 != 0).sum();
    }
}
