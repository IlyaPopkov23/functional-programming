package com.itrexgroup.advconcepts.domainprojects;

public class User {
    private String login;
    private Account account;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
