package com.itrexgroup.advconcepts;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.function.Function;
import java.util.function.IntFunction;

public class CurriedFunctions {
    public static void main(String[] args) {
        /*  Write a curried form of the function f(x, y, z) = x + y * y + z * z * z   f(x,y,z)=x+y∗y+z∗z∗z    using lambda expressions in Java 8 style.
        The result and x, y, z must be integer numbers. */

        IntFunction<Function<Integer, Function<Integer, Integer>>> intFunc = x -> y -> z -> x + y * y + z * z * z;

        System.out.println(intFunc.apply(1).apply(1).apply(1));
        System.out.println(intFunc.apply(2).apply(3).apply(4));

        /*  Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string following the rules:
            String cases: in the result string, first and second arguments must be in lower cases and third and fourth in upper cases.
            Order of arguments concatenation: first, third, second, fourth.     */
        Function<String, Function<String, Function<String, Function<String, String>>>> stringConcatFunc = a -> b -> c -> d -> a.toLowerCase() + c.toUpperCase() + b.toLowerCase() + d.toUpperCase();
        System.out.println(stringConcatFunc.apply("aaa").apply("bbb").apply("ccc").apply("ddd"));
    }
}
