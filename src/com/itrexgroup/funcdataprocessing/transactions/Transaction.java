package com.itrexgroup.funcdataprocessing.transactions;

import com.itrexgroup.funcdataprocessing.transactions.Enums.EnumState;

import java.util.Date;

public class Transaction {
    private EnumState state;
    private String uuid;
    private Long sum;
    private Date created;

    public Transaction(EnumState state, Long sum) {
        this.state = state;
        this.sum = sum;
    }

    public EnumState getState() {
        return state;
    }

    public void setState(EnumState state) {
        this.state = state;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
