package com.virtualspace.database.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.virtualspace.database.model.Story;

public interface StoryMapper {
    int deleteByPrimaryKey(String pk);

    int insert(Story record);

    int insertSelective(Story record);

    Story selectByPrimaryKey(String pk);

    int updateByPrimaryKeySelective(Story record);

    int updateByPrimaryKey(Story record);
    
    List<Story> selectStoriedByPks(List<String> pks);
    
    List<Story> selectStoriedByVisiType(@Param("pks") List<String> pks,@Param("visitype") String visitype);
}