package com.anonym.wxminiprogram.dao;

import com.anonym.wxminiprogram.domain.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

/**
 * @author 杨帆
 * @date 2018/6/25 17:45
 * @desc v1.0.0
 */
@Mapper
public interface CityMapper {

    @Select("SELECT * FROM city WHERE state = #{state}")
    City findByState(String state);

    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    @Insert("insert into city(name, state, country, test_caml) values(#{name}, #{state}, #{country}, #{testCaml})")
    int insert(City record);
}