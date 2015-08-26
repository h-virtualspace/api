package com.virtualspace.database.model;

import java.util.Date;

public class StoryActivity {
    private String pk;

    private String content;

    private Date startTime;

    private Date endTime;

    private String address;

    private Short money;

    private Byte allPersons;

    private Byte registeredPersons;

    private String confirmCondition;

    private Short effectiveTime;

    private String creator;

    private Date createTime;

    private Date lastModifyTime;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk == null ? null : pk.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Short getMoney() {
        return money;
    }

    public void setMoney(Short money) {
        this.money = money;
    }

    public Byte getAllPersons() {
        return allPersons;
    }

    public void setAllPersons(Byte allPersons) {
        this.allPersons = allPersons;
    }

    public Byte getRegisteredPersons() {
        return registeredPersons;
    }

    public void setRegisteredPersons(Byte registeredPersons) {
        this.registeredPersons = registeredPersons;
    }

    public String getConfirmCondition() {
        return confirmCondition;
    }

    public void setConfirmCondition(String confirmCondition) {
        this.confirmCondition = confirmCondition == null ? null : confirmCondition.trim();
    }

    public Short getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Short effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}