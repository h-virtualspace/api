package com.virtualspace.database.dao;

import com.virtualspace.database.model.UserCircle;
import com.virtualspace.database.model.UserCircleKey;

public interface UserCircleMapper {
    int deleteByPrimaryKey(UserCircleKey key);

    int insert(UserCircle record);

    int insertSelective(UserCircle record);

    UserCircle selectByPrimaryKey(UserCircleKey key);

    int updateByPrimaryKeySelective(UserCircle record);

    int updateByPrimaryKey(UserCircle record);
}