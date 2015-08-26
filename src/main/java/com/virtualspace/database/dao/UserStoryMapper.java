package com.virtualspace.database.dao;

import com.virtualspace.database.model.UserStory;
import com.virtualspace.database.model.UserStoryKey;

public interface UserStoryMapper {
    int deleteByPrimaryKey(UserStoryKey key);

    int insert(UserStory record);

    int insertSelective(UserStory record);

    UserStory selectByPrimaryKey(UserStoryKey key);

    int updateByPrimaryKeySelective(UserStory record);

    int updateByPrimaryKey(UserStory record);
}