package com.virtualspace.database.dao;

import java.util.List;

import com.virtualspace.database.model.PosQueryCondition;
import com.virtualspace.database.model.Position;
import com.virtualspace.database.model.PositionKey;

public interface PositionMapper {
    int deleteByPrimaryKey(PositionKey key);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(PositionKey key);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    
    List<Position> getPositions(PosQueryCondition queryCondition);
}