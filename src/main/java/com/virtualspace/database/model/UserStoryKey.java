package com.virtualspace.database.model;

public class UserStoryKey {
    private String pkUser;

    private String pkStory;

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    public String getPkStory() {
        return pkStory;
    }

    public void setPkStory(String pkStory) {
        this.pkStory = pkStory == null ? null : pkStory.trim();
    }
}