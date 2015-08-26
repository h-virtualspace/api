package com.virtualspace.database.dao;

import com.virtualspace.database.model.UserMessage;
import com.virtualspace.database.model.UserMessageKey;

public interface UserMessageMapper {
    int deleteByPrimaryKey(UserMessageKey key);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(UserMessageKey key);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKeyWithBLOBs(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}