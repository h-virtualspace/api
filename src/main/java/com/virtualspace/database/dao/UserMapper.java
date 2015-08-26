package com.virtualspace.database.dao;

import org.apache.ibatis.annotations.Param;

import com.virtualspace.database.model.User;

public interface UserMapper 
{
    int deleteByPrimaryKey(String pk);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User loginByTelephone(@Param("telephone") String telephone,@Param("password") String password);
    
    User loginByEmail(@Param("email") String email,@Param("password") String password);
    
    int isUserExistsByTelephone(String telephone);
    
    int isUserExistsByEmail(String email);
}