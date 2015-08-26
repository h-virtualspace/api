package com.virtualspace.database.model;

public class HotPosition {
    private String pk;

    private String name;

    private String description;

    private String parentPk;

    private String centerPosition;

    private Integer range;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk == null ? null : pk.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getParentPk() {
        return parentPk;
    }

    public void setParentPk(String parentPk) {
        this.parentPk = parentPk == null ? null : parentPk.trim();
    }

    public String getCenterPosition() {
        return centerPosition;
    }

    public void setCenterPosition(String centerPosition) {
        this.centerPosition = centerPosition == null ? null : centerPosition.trim();
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}