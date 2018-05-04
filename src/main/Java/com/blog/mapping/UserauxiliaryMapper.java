package com.blog.mapping;

import com.blog.entity.Userauxiliary;
import com.blog.entity.UserauxiliaryWithBLOBs;

public interface UserauxiliaryMapper {
    int deleteByPrimaryKey(String auxiliaryId);

    int insert(UserauxiliaryWithBLOBs record);

    int insertSelective(UserauxiliaryWithBLOBs record);

    UserauxiliaryWithBLOBs selectByPrimaryKey(String auxiliaryId);

    int updateByPrimaryKeySelective(UserauxiliaryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserauxiliaryWithBLOBs record);

    int updateByPrimaryKey(Userauxiliary record);
}