package com.itrexgroup.func_data_processing.transactions;

import com.itrexgroup.func_data_processing.transactions.Enums.EnumState;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // tests from comments on Stepik

        final Transaction t1 = new Transaction(EnumState.CANCELED, 1000L);
        final Account a1 = new Account(0L, Collections.singletonList(t1));

        final Transaction t2 = new Transaction(EnumState.FINISHED, 8000L);
        final Transaction t3 = new Transaction(EnumState.CANCELED, 10_000L);
        final Account a2 = new Account(8000L, Arrays.asList(t2, t3));

        final Transaction t4 = new Transaction(EnumState.FINISHED, 9000L);
        final Transaction t5 = new Transaction(EnumState.CANCELED, 3000L);
        final Account a3 = new Account(8000L, Arrays.asList(t4, t5));

        // 13000 expected
        System.out.println(TransactionManager.calcSumOfCanceledTransOnNonEmptyAccounts(Arrays.asList(a1, a2, a3)));
    }
}
