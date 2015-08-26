package com.virtualspace.database.dao;

import com.virtualspace.database.model.UserFavorite;
import com.virtualspace.database.model.UserFavoriteKey;

public interface UserFavoriteMapper {
    int deleteByPrimaryKey(UserFavoriteKey key);

    int insert(UserFavorite record);

    int insertSelective(UserFavorite record);

    UserFavorite selectByPrimaryKey(UserFavoriteKey key);

    int updateByPrimaryKeySelective(UserFavorite record);

    int updateByPrimaryKey(UserFavorite record);
}