package com.itrexgroup.collectors.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionManager {
    public static void main(String[] args) {
        // test data from comments
        List<Transaction> transactions = new ArrayList<>();
        Account ac1 = new Account("101", 2000L);
        Account ac2 = new Account("102", 2500L);
        Account ac3 = new Account("103", 3000L);
        transactions.add(new Transaction("101_1", 5000L, ac1));
        transactions.add(new Transaction("101_2", 5000L, ac1));
        transactions.add(new Transaction("102_1", 10000L, ac2));
        transactions.add(new Transaction("102_2", 10000L, ac2));
        transactions.add(new Transaction("103_1", 15000L, ac3));
        transactions.add(new Transaction("103_2", 15000L, ac3));

        /*  Write a collector that calculates the total sum of transactions (long type, not integer) by each account (i.e. by account number).
        The collector will be applied to a stream of transactions.  */

        Map<String, Long> totalSumOfTransByEachAccount =
                transactions.stream()
                        .collect(Collectors.toMap(x -> x.getAccount().getNumber(), Transaction::getSum, Long::sum));

        totalSumOfTransByEachAccount.forEach((x,y) -> System.out.println(y));
    }
}
