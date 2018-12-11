package com.yanbin.dao;

import com.yanbin.pojo.Health;

import java.util.List;

public interface HealthMapper {

        //查询所有
        List<Health> selectById();

    //根据id修改信息
    Health getHealthDetailById(Integer id);

    //修改信息
    int updateByPrimaryKeySelective(Health record);

    int updateByPrimaryKey(Health record);
}