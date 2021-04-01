package com.itrexgroup.func_data_processing;

import java.util.stream.IntStream;

public class NumbersFiltering {
    /*  You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers.
    Create the third stream that contains numbers from both streams which is divisible by 3 and 5.
    After calling collect(Collectors.toList()) the stream should return sorted list (ascending) of these numbers.
    Two first suitable numbers in the sorted list must be skipped.  */
    public static void main(String[] args) {

    }

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream).
                filter(x -> x % 3 == 0 && x % 5 == 0).sorted().skip(2);
    }
}
