package org.github.caishijun.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.github.caishijun.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM TR_USER")
    List<User> findAll();

    @Insert("INSERT INTO TR_USER(NAME) VALUES(#{name})")
    int save(@Param("name") String name);

}