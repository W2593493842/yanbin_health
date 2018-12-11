package com.yanbin.service.impl;

import com.yanbin.dao.HealthMapper;
import com.yanbin.pojo.Health;
import com.yanbin.service.HealthService;
import com.yanbin.vo.R;
import com.yanbin.vo.RUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.yanbin.vo.R;

/**
 * @ClassName 你好！！！
 * @Auther 彬
 * Date 2018/12/10 15:52
 */
@Service
public class HealthServiceImpl implements HealthService {


    @Autowired
    private HealthMapper healthMapper;

    /**
     * 查询所有展示
     * @param
     * @return
     */
    @Override
    public R selectById() {
        System.out.println(healthMapper.selectById() + "////////////////");
        if(healthMapper.selectById()!=null){
            return RUtil.setOK("查询成功", healthMapper.selectById());
        }else {
            return RUtil.setERROR("查询失败",null);
        }
    }


    @Override
    public R getHealthDetailById(Integer id) {
       if (healthMapper.getHealthDetailById(id)!=null){
           return RUtil.setOK("查询成功", healthMapper.getHealthDetailById(id));
       }else {
           return RUtil.setERROR("查询失败", null);
       }
    }


    //修改
    @Override
    public boolean updateHealth(Health health) {
        return healthMapper.updateByPrimaryKey(health) == 0 ? false : true;
    }


}
