package com.itrexgroup.lambdas;

import java.util.function.*;

public class SimpleLambda {
    public static void main(String[] args) {
        /*Write a lambda expression that accepts two integers arguments and returns max of them.
        Try not to use the Math library.*/

        IntBinaryOperator compare = (x, y) -> (x < y) ? y : x;
        // assert 3 == compare.applyAsInt(2,3);

         /*Write a lambda expression that accepts a long value and returns a next even number.
         It is guaranteed an input number is non-negative.*/
        LongUnaryOperator addOne = (i) -> i % 2 == 0 ? i + 2 : i + 1;
    }




}
