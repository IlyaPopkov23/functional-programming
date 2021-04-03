package com.itrexgroup.funcinterfaces;

import java.util.List;
import java.util.function.IntPredicate;

public class ComposingPredicates {
    /*Write the disjunctAll method that accepts a list of IntPredicate's and returns a single IntPredicate.
    The result predicate is a disjunction of all input predicates.
    If the input list is empty then the result predicate should return false for any integer value (always false).*/
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream()
                .reduce(i -> false, IntPredicate::or);
    }
}
