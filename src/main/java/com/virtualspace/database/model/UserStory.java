package com.virtualspace.database.model;

import java.util.Date;

public class UserStory extends UserStoryKey {
    private Boolean isHate;

    private Boolean isLike;

    private Boolean isComplaint;

    private Boolean isCollect;

    private String comment;

    private Date createTime;

    private String createLocation;

    private Date lastModifyTime;

    public Boolean getIsHate() {
        return isHate;
    }

    public void setIsHate(Boolean isHate) {
        this.isHate = isHate;
    }

    public Boolean getIsLike() {
        return isLike;
    }

    public void setIsLike(Boolean isLike) {
        this.isLike = isLike;
    }

    public Boolean getIsComplaint() {
        return isComplaint;
    }

    public void setIsComplaint(Boolean isComplaint) {
        this.isComplaint = isComplaint;
    }

    public Boolean getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateLocation() {
        return createLocation;
    }

    public void setCreateLocation(String createLocation) {
        this.createLocation = createLocation == null ? null : createLocation.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}