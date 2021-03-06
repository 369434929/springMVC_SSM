package com.blog.mapping;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(String userUuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userUuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(@Param("user") String user, @Param("pas") String pas);
}