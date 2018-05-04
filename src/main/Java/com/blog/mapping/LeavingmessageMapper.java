package com.blog.mapping;

import com.blog.entity.Leavingmessage;
import com.blog.entity.LeavingmessageWithBLOBs;

public interface LeavingmessageMapper {
    int deleteByPrimaryKey(String leavingId);

    int insert(LeavingmessageWithBLOBs record);

    int insertSelective(LeavingmessageWithBLOBs record);

    LeavingmessageWithBLOBs selectByPrimaryKey(String leavingId);

    int updateByPrimaryKeySelective(LeavingmessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LeavingmessageWithBLOBs record);

    int updateByPrimaryKey(Leavingmessage record);
}