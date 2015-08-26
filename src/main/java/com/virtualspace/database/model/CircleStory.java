package com.virtualspace.database.model;

import java.util.Date;

public class CircleStory extends CircleStoryKey {
    private Date createTime;

    private String creator;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}