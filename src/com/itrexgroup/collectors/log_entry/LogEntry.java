package com.itrexgroup.collectors.log_entry;

import java.util.Date;

public class LogEntry {
    Date created;
    String login;
    String url;

    public LogEntry(Date created, String login, String url) {
        this.created = created;
        this.login = login;
        this.url = url;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
