package com.yanbin.service;

import com.yanbin.pojo.Health;
import com.yanbin.vo.R;

//import com.yanbin.vo.;


/**
 * @Interface 你好！！！
 * @Auther 彬
 * Date 2018/12/10 15:50
 */
public interface HealthService {

    //查询所有展示
    R selectById();
//    public PageInfo<Health> selectById(String pageNum, String pageSize);

    //根据id查询详细
    R getHealthDetailById(Integer id);

    //修改信息
    public boolean updateHealth(Health health);

}
