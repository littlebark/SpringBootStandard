package com.example.demo.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by littlebark on 2017/7/27.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);
    @Insert("INSERT INTO USER(ID,NAME, AGE) VALUES(#{id},#{name}, #{age})")
    int insert(@Param("id") int id,@Param("name") String name, @Param("age") Integer age);
}
