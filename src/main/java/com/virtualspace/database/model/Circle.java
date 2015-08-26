package com.virtualspace.database.model;

import java.util.Date;

public class Circle extends CircleKey {
    private Date createTime;

    private String createPosition;

    private String lastModifyPerson;

    private Date lastModifyTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePosition() {
        return createPosition;
    }

    public void setCreatePosition(String createPosition) {
        this.createPosition = createPosition == null ? null : createPosition.trim();
    }

    public String getLastModifyPerson() {
        return lastModifyPerson;
    }

    public void setLastModifyPerson(String lastModifyPerson) {
        this.lastModifyPerson = lastModifyPerson == null ? null : lastModifyPerson.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}