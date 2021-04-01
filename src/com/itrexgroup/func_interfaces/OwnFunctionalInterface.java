package com.itrexgroup.func_interfaces;

public class OwnFunctionalInterface {
    /*  You need to write your own functional interface (TernaryIntPredicate) and use it with a lambda expression.
    The interface must have a single non-static (and non-default) method test with three int arguments that returns boolean value.
    Besides, you need to write a lambda expression with three int arguments using your TernaryIntPredicate.

    The lambda expression has to return true if all passed values are different otherwise false.
    The name of the instance is allValuesAreDifferentPredicate. It should be a static field.    */

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }
    public static final TernaryIntPredicate allValuesAreDifferentPredicate = ((a, b, c) -> a != b && b != c && a != c);

    public static void main(String[] args) {
        System.out.println(allValuesAreDifferentPredicate.test(20, 30 , 20));
    }
}
