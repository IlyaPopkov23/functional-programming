package com.itrexgroup.func_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountManager {
    public static void main(String[] args) {
        /*Write a code for filtering the accounts list in two ways:

        get list with all non-empty accounts (balance > 0) and save it to the variable nonEmptyAccounts
        get all non-locked accounts with too much money (balance >= 10L) and save it to the variable accountsWithTooMuchMoney
        */
        boolean isLocked;
        long balance;
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            isLocked = i % 2 == 0;
            balance = -10L + (long) (Math.random() * (100L - 10L));
            accounts.add(new Account("num" + i, balance, isLocked));
        }

        List<Account> nonEmptyAccounts = accounts.stream().filter(account -> account.getBalance() > 0).collect(Collectors.toList());
        nonEmptyAccounts.forEach(account -> System.out.println(account.getBalance()));
        List<Account> tooMuchMoneyAccounts = accounts.stream().filter(account -> !account
                .isLocked() && account.getBalance() > 10L).collect(Collectors.toList());
        tooMuchMoneyAccounts
                .forEach(account -> System.out.println("Account balance: " + account.getBalance() + ". Account number: " + account.getNumber()));

    }
}
