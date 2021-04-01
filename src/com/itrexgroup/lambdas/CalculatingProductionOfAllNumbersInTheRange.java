package com.itrexgroup.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class CalculatingProductionOfAllNumbersInTheRange {
    /*Write a lambda expression that accepts two long arguments as a range borders
    and calculates (returns) production of all numbers in this range (inclusively).
    It's guaranteed that 0 <= left border <= right border. if left border == right border then the result is any border.*/

    public static void main(String[] args) {
        long randomLongX = 1L + (long) (Math.random() * (10L - 1L));
        long randomLongY = 1L + (long) (Math.random() * (10L - 1L));

        LongBinaryOperator rangeMultiplier = (x, y) -> x == y ? x : LongStream.rangeClosed(x, y).reduce(1, (a, b) -> a * b);
        final Long result = rangeMultiplier.applyAsLong(randomLongX, randomLongY);
        System.out.println(result);
    }
}
