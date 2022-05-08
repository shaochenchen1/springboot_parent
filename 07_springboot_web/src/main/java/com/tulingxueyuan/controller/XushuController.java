package com.tulingxueyuan.controller;


import com.tulingxueyuan.entity.Result;
import com.tulingxueyuan.entity.User;
import com.tulingxueyuan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Controller
@RequestMapping("/xushu")
public class XushuController {


    //Rest  /user/1
    @GetMapping("/test")
    public String getUser() {
        // 定义好excel要到处的数据
        return "xushu";
    }


    //Rest  /user/1
    @GetMapping("/html")
    public String getHtml() {
        // 定义好excel要到处的数据
        return "hello";
    }

}
