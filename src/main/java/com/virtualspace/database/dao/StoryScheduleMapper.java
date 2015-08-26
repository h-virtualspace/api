package com.virtualspace.database.dao;

import com.virtualspace.database.model.StorySchedule;

public interface StoryScheduleMapper {
    int deleteByPrimaryKey(String pk);

    int insert(StorySchedule record);

    int insertSelective(StorySchedule record);

    StorySchedule selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(StorySchedule record);

    int updateByPrimaryKey(StorySchedule record);
}