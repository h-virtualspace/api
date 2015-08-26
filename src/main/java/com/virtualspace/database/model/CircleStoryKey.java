package com.virtualspace.database.model;

public class CircleStoryKey {
    private String pkCircle;

    private String pkStory;

    public String getPkCircle() {
        return pkCircle;
    }

    public void setPkCircle(String pkCircle) {
        this.pkCircle = pkCircle == null ? null : pkCircle.trim();
    }

    public String getPkStory() {
        return pkStory;
    }

    public void setPkStory(String pkStory) {
        this.pkStory = pkStory == null ? null : pkStory.trim();
    }
}