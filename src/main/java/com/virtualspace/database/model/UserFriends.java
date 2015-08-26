package com.virtualspace.database.model;

public class UserFriends extends UserFriendsKey {
    private String remarks;

    private String isVip;

    private String isBlanklist;

    private String isStoryEnable;

    private String isStoryEnabled;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip == null ? null : isVip.trim();
    }

    public String getIsBlanklist() {
        return isBlanklist;
    }

    public void setIsBlanklist(String isBlanklist) {
        this.isBlanklist = isBlanklist == null ? null : isBlanklist.trim();
    }

    public String getIsStoryEnable() {
        return isStoryEnable;
    }

    public void setIsStoryEnable(String isStoryEnable) {
        this.isStoryEnable = isStoryEnable == null ? null : isStoryEnable.trim();
    }

    public String getIsStoryEnabled() {
        return isStoryEnabled;
    }

    public void setIsStoryEnabled(String isStoryEnabled) {
        this.isStoryEnabled = isStoryEnabled == null ? null : isStoryEnabled.trim();
    }
}