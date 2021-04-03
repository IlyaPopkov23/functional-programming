package com.itrexgroup.collectors;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.reducing;

public class ProductOfSquares {
    /*  Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
     */

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 10, 12);
        // answer with collect method (as required)
        long collector = numbers.stream().collect(reducing(1, x -> x * x, Math::multiplyExact));
        //alt. long collector = numbers.stream().map(x -> x * x).reduce(1, Math::multiplyExact);
        System.out.println(collector);
    }
}
