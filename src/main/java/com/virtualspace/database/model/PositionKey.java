package com.virtualspace.database.model;

public class PositionKey {
    private String pk;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk == null ? null : pk.trim();
    }
}