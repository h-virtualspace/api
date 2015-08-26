package com.virtualspace.database.model;

public class UserSysSetting {
    private String pkUser;

    private Short fontSize;

    private Short wifiSetting;

    private Boolean pushMessage;

    private String offlineList;

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    public Short getFontSize() {
        return fontSize;
    }

    public void setFontSize(Short fontSize) {
        this.fontSize = fontSize;
    }

    public Short getWifiSetting() {
        return wifiSetting;
    }

    public void setWifiSetting(Short wifiSetting) {
        this.wifiSetting = wifiSetting;
    }

    public Boolean getPushMessage() {
        return pushMessage;
    }

    public void setPushMessage(Boolean pushMessage) {
        this.pushMessage = pushMessage;
    }

    public String getOfflineList() {
        return offlineList;
    }

    public void setOfflineList(String offlineList) {
        this.offlineList = offlineList == null ? null : offlineList.trim();
    }
}