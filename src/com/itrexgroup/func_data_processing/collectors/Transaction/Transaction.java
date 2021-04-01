package com.itrexgroup.func_data_processing.collectors.Transaction;

public class Transaction {
    Account account;
    String uuid;
    Long sum;

    public Transaction(String uuid, Long sum, Account account) {
        this.account = account;
        this.uuid = uuid;
        this.sum = sum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}
