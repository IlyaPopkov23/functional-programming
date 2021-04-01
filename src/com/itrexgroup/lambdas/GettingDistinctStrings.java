package com.itrexgroup.lambdas;

import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class GettingDistinctStrings {
    public static void main(String[] args) {
        /*Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
        The order of elements in the result list may be any (elements will be sorted by the testing system).
        If the input list doesn't contain any strings then the result list should be empty.*/

        UnaryOperator<List<String>> function = (List<String> x) -> x.stream().distinct().collect(Collectors.toList());
    }
}
