package com.itrexgroup.func_data_processing;

import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(5));
    }

    public static long factorial(long n) {
        return LongStream.rangeClosed(2, n).reduce(1L, (x, y) -> x * y);
    }
}
