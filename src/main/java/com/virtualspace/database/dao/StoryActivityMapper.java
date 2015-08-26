package com.virtualspace.database.dao;

import com.virtualspace.database.model.StoryActivity;

public interface StoryActivityMapper {
    int deleteByPrimaryKey(String pk);

    int insert(StoryActivity record);

    int insertSelective(StoryActivity record);

    StoryActivity selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(StoryActivity record);

    int updateByPrimaryKey(StoryActivity record);
}