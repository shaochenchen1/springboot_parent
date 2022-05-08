package com.tulingxueyuan.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Profile("prod")
@RestController
@RequestMapping("/hello")
public class HelloControllerProd {

    @RequestMapping("/file")
    public  String sayHi(){
        return "Hello SpringBoot prod";
    }
}
