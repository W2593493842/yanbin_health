package com.yanbin.dao;

import com.yanbin.pojo.HealthType;

public interface HealthTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HealthType record);

    int insertSelective(HealthType record);

    HealthType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HealthType record);

    int updateByPrimaryKey(HealthType record);
}