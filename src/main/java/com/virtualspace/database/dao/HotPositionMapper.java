package com.virtualspace.database.dao;

import com.virtualspace.database.model.HotPosition;

public interface HotPositionMapper {
    int deleteByPrimaryKey(String pk);

    int insert(HotPosition record);

    int insertSelective(HotPosition record);

    HotPosition selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(HotPosition record);

    int updateByPrimaryKey(HotPosition record);
}