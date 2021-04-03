package com.itrexgroup.advconcepts.domainprojects;

import java.util.UUID;

public class Account {
    private long balance;
    private UUID uuid;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
