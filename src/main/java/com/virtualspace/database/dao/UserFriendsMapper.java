package com.virtualspace.database.dao;

import com.virtualspace.database.model.UserFriends;
import com.virtualspace.database.model.UserFriendsKey;

public interface UserFriendsMapper {
    int deleteByPrimaryKey(UserFriendsKey key);

    int insert(UserFriends record);

    int insertSelective(UserFriends record);

    UserFriends selectByPrimaryKey(UserFriendsKey key);

    int updateByPrimaryKeySelective(UserFriends record);

    int updateByPrimaryKey(UserFriends record);
}