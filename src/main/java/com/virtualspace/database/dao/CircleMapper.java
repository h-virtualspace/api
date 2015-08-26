package com.virtualspace.database.dao;

import com.virtualspace.database.model.Circle;
import com.virtualspace.database.model.CircleKey;

public interface CircleMapper {
    int deleteByPrimaryKey(CircleKey key);

    int insert(Circle record);

    int insertSelective(Circle record);

    Circle selectByPrimaryKey(CircleKey key);

    int updateByPrimaryKeySelective(Circle record);

    int updateByPrimaryKey(Circle record);
}