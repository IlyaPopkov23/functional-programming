package com.itrexgroup.advconcepts;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class CustomIntegerReducer {
    public static void main(String[] args) {
        BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator
                = (seed, operator) -> (left, right) -> IntStream.rangeClosed(left, right).reduce(seed, operator);

        IntBinaryOperator sumOperator = reduceIntOperator.apply(0, Integer::sum);
        IntBinaryOperator productOperator = reduceIntOperator.apply(1, Math::multiplyExact);

        System.out.println(sumOperator.applyAsInt(5, 6));
        System.out.println(productOperator.applyAsInt(5, 6));

        
    }
}
