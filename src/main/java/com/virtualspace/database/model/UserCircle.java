package com.virtualspace.database.model;

public class UserCircle extends UserCircleKey {
    private String role;

    private Boolean receiveInfo;

    private Boolean sendInfo;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Boolean getReceiveInfo() {
        return receiveInfo;
    }

    public void setReceiveInfo(Boolean receiveInfo) {
        this.receiveInfo = receiveInfo;
    }

    public Boolean getSendInfo() {
        return sendInfo;
    }

    public void setSendInfo(Boolean sendInfo) {
        this.sendInfo = sendInfo;
    }
}