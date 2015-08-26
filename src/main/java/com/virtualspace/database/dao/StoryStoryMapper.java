package com.virtualspace.database.dao;

import com.virtualspace.database.model.StoryStory;

public interface StoryStoryMapper {
    int deleteByPrimaryKey(String pk);

    int insert(StoryStory record);

    int insertSelective(StoryStory record);

    StoryStory selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(StoryStory record);

    int updateByPrimaryKeyWithBLOBs(StoryStory record);
}