package com.yanbin.controller;

import com.yanbin.pojo.Health;
import com.yanbin.service.HealthService;
import com.yanbin.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import com.yanbin.vo.R;

/**
 * @ClassName 你好！！！
 * @Auther 彬
 * Date 2018/12/10 15:54
 */
@Controller
public class HealthController {

    @Autowired
    private HealthService healthService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public R selectById(){
        return healthService.selectById();
    }

    @RequestMapping("/detail")
    @ResponseBody
    public R getHealthDetailById(Integer id){

        return healthService.getHealthDetailById(id);
    }

    @RequestMapping("/update")
    public void updateHealth(HttpServletResponse response, Health health) throws IOException {

        boolean b = healthService.updateHealth(health);

        // history.back是回上一页，history.go(i)指定去某一页
        String msgSuccess = "<script>alert('success')window.history.back()</script>";
        String msgError = "<script>alert('error')window.history.back()</script>";

        response.getWriter().print(b ? msgSuccess: msgError);
    }

}
