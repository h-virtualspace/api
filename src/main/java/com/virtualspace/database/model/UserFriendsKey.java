package com.virtualspace.database.model;

public class UserFriendsKey {
    private String pkUserSrc;

    private String pkUserTarget;

    public String getPkUserSrc() {
        return pkUserSrc;
    }

    public void setPkUserSrc(String pkUserSrc) {
        this.pkUserSrc = pkUserSrc == null ? null : pkUserSrc.trim();
    }

    public String getPkUserTarget() {
        return pkUserTarget;
    }

    public void setPkUserTarget(String pkUserTarget) {
        this.pkUserTarget = pkUserTarget == null ? null : pkUserTarget.trim();
    }
}