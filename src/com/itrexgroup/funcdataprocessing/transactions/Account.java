package com.itrexgroup.funcdataprocessing.transactions;

import java.util.List;

public class Account {
    private String number;
    private Long balance;
    private List<Transaction> transactions;

    public Account(Long balance, List<Transaction> transactions) {
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactionList(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
