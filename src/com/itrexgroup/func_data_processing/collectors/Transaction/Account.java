package com.itrexgroup.func_data_processing.collectors.Transaction;

public class Account {
    String number;
    Long balance;

    public Account(String number, Long balance) {
        this.number = number;
        this.balance = balance;
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
}
