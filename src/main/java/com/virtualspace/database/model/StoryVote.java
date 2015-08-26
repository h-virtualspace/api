package com.virtualspace.database.model;

public class StoryVote {
    private String pk;

    private String content;

    private Integer type;

    private Byte maxSelected;

    private Boolean isVotedNamed;

    private Boolean isInvitationCode;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Byte getMaxSelected() {
        return maxSelected;
    }

    public void setMaxSelected(Byte maxSelected) {
        this.maxSelected = maxSelected;
    }

    public Boolean getIsVotedNamed() {
        return isVotedNamed;
    }

    public void setIsVotedNamed(Boolean isVotedNamed) {
        this.isVotedNamed = isVotedNamed;
    }

    public Boolean getIsInvitationCode() {
        return isInvitationCode;
    }

    public void setIsInvitationCode(Boolean isInvitationCode) {
        this.isInvitationCode = isInvitationCode;
    }
}