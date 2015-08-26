package com.virtualspace.database.dao;

import com.virtualspace.database.model.StoryVisibility;

public interface StoryVisibilityMapper {
    int deleteByPrimaryKey(String pk);

    int insert(StoryVisibility record);

    int insertSelective(StoryVisibility record);

    StoryVisibility selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(StoryVisibility record);

    int updateByPrimaryKey(StoryVisibility record);
}