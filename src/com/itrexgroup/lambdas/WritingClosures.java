package com.itrexgroup.lambdas;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;

public class WritingClosures {
    public static void main(String[] args) {
        /*Using closure write a lambda expression that calculates a∗x^2+b∗x+c where a, b, c are context final variables.
        They will be available in the context during testing. Note, the result is double.*/

        // 'context' variables
        double a = Math.random() * 10;
        double b = Math.random() * 100;
        double c = Math.random() * 50;

        Function <Double, Double> calc = (x) -> a * Math.pow(x, 2) + b * x + c;
        System.out.println(calc.apply(5.0));

        /*Using closure write a lambda expression that adds prefix (before) and suffix (after) to its single string argument.
        prefix and suffix are final variables and will be available in the context during testing.*/

        // 'context' variables
        String prefix = "BEFORE";
        String suffix = "AFTER";

        Function<String, String> addValues = (x) -> prefix + x.trim() + suffix;
        System.out.println(addValues);
    }
}
