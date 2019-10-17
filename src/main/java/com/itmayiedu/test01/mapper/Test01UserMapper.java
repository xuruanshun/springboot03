package com.itmayiedu.test01.mapper;

import com.itmayiedu.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface Test01UserMapper {

    @Select("SELECT * FROM t_user WHERE NAME = #{name}")
    UserEntity findByName(@Param("name") String name);

    @Insert("INSERT INTO t_user(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
