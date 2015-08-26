package com.virtualspace.database.dao;

import com.virtualspace.database.model.UserSysSetting;

public interface UserSysSettingMapper {
    int deleteByPrimaryKey(String pkUser);

    int insert(UserSysSetting record);

    int insertSelective(UserSysSetting record);

    UserSysSetting selectByPrimaryKey(String pkUser);

    int updateByPrimaryKeySelective(UserSysSetting record);

    int updateByPrimaryKeyWithBLOBs(UserSysSetting record);

    int updateByPrimaryKey(UserSysSetting record);
}