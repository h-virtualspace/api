package com.virtualspace.database.dao;

import com.virtualspace.database.model.CircleStory;
import com.virtualspace.database.model.CircleStoryKey;

public interface CircleStoryMapper {
    int deleteByPrimaryKey(CircleStoryKey key);

    int insert(CircleStory record);

    int insertSelective(CircleStory record);

    CircleStory selectByPrimaryKey(CircleStoryKey key);

    int updateByPrimaryKeySelective(CircleStory record);

    int updateByPrimaryKey(CircleStory record);
}