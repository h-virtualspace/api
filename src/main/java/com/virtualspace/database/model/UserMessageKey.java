package com.virtualspace.database.model;

public class UserMessageKey {
    private String pkUserFrom;

    private String pkUserTo;

    public String getPkUserFrom() {
        return pkUserFrom;
    }

    public void setPkUserFrom(String pkUserFrom) {
        this.pkUserFrom = pkUserFrom == null ? null : pkUserFrom.trim();
    }

    public String getPkUserTo() {
        return pkUserTo;
    }

    public void setPkUserTo(String pkUserTo) {
        this.pkUserTo = pkUserTo == null ? null : pkUserTo.trim();
    }
}