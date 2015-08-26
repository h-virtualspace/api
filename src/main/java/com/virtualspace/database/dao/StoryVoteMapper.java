package com.virtualspace.database.dao;

import com.virtualspace.database.model.StoryVote;

public interface StoryVoteMapper {
    int deleteByPrimaryKey(String pk);

    int insert(StoryVote record);

    int insertSelective(StoryVote record);

    StoryVote selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(StoryVote record);

    int updateByPrimaryKey(StoryVote record);
}