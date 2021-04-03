package com.itrexgroup.funcdataprocessing;

import java.util.stream.IntStream;

public class CheckingIfNumberIsPrime {
    public static void main(String[] args) {

    }

    /*  Write a method using Stream API to check the input number is prime or not.
    Let's agree that input value is always greater than 1 (i.e. 2, 3, 4, 5, ....).
    Use the provided template for your method.A prime number is a value greater than 1 that has no positive divisors other than 1 and itself    */

    public static boolean isPrime(final long number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}
