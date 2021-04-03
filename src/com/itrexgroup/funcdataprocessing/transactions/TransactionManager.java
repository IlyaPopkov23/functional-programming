package com.itrexgroup.funcdataprocessing.transactions;

import com.itrexgroup.funcdataprocessing.transactions.Enums.EnumState;

import java.util.List;

public class TransactionManager {
    /*  Write a method using Stream API that calculates the total sum of canceled transactions for all non-empty accounts (balance > 0).
    Perhaps, flatMap method can help you to implement it   .*/

    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals(EnumState.CANCELED))
                .mapToLong(Transaction::getSum)
                .sum();
    }
}
