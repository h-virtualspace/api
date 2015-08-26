package com.virtualspace.database.model;

import java.util.Date;

public class Story 
{
	/**
	 * 活动
	 */
	public final static String STORY_TYPE_ACTIVITY = "1";
	/**
	 * 投票
	 */
	public final static String STORY_TYPE_VOTE = "2";
	/**
	 * 故事
	 */
	public final static String STORY_TYPE_STORY = "3";
	/**
	 * 说说
	 */
	public final static String STORY_TYPE_MARK = "4";
	
	/**
	 * 自己可见
	 */
	public final static String STORY_VISI_SELF = "1";
	
	/**
	 * 朋友可见
	 */
	public final static String STORY_VISI_FRIEND = "2";
	/**
	 * 圈子可见
	 */
	public final static String STORY_VISI_CIRCLE = "3";
	/**
	 * 陌生人可见
	 */
	public final static String STORY_VISI_STRANGER = "4";

	
    private String pk;

    private String type;

    private String tag;

    private String title;

    private String summary;

    private Integer validateTime;

    private String visibility;

    private String creator;

    private Date createTime;

    private String createLocation;

    private String lastModifyLocation;

    private Date lastModifyTime;

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk == null ? null : pk.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getValidateTime() {
        return validateTime;
    }

    public void setValidateTime(Integer validateTime) {
        this.validateTime = validateTime;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility == null ? null : visibility.trim();
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

    public String getCreateLocation() {
        return createLocation;
    }

    public void setCreateLocation(String createLocation) {
        this.createLocation = createLocation == null ? null : createLocation.trim();
    }

    public String getLastModifyLocation() {
        return lastModifyLocation;
    }

    public void setLastModifyLocation(String lastModifyLocation) {
        this.lastModifyLocation = lastModifyLocation == null ? null : lastModifyLocation.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}