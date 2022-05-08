package com.tulingxueyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("index")
    public  String index(Model model){
        model.addAttribute("username","xushu");
        return "index";
    }

    @RequestMapping("list")
    public  String list(Model model){
        List<String> list= Arrays.asList("xushu","zhangsan","lisi");
        model.addAttribute("usernames",list);
        return "list";
    }
}
