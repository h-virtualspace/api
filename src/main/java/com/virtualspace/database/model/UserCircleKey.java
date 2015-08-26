package com.virtualspace.database.model;

public class UserCircleKey {
    private String pkUser;

    private String pkCircle;

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    public String getPkCircle() {
        return pkCircle;
    }

    public void setPkCircle(String pkCircle) {
        this.pkCircle = pkCircle == null ? null : pkCircle.trim();
    }
}