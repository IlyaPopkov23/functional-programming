package com.itrexgroup.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningWordsIntoGroups {
    /*  Write a collector that partitions all words in a stream into two groups: palindromes (true) and usual words (false).
    The collector should return Map<Boolean, List<String>>. All input words will be in the same case (lower).
     */

    public static void main(String[] args) {
        String[] words = {"wow", "java", "some", "music", "reverse", "madam"};
        Map<Boolean, List<String>> partitionedWords = Arrays.stream(words)
                .collect(Collectors.partitioningBy(word -> new StringBuilder(word).reverse().toString().equals(word)));
        partitionedWords.forEach((x,y) -> System.out.println(y));
    }
}
