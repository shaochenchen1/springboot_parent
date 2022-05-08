package com.tulingxueyuan;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class SpringInitializrApplication {

    public static void main(String[] args){
        SpringApplication app=new SpringApplication(SpringInitializrApplication.class);
        //app.setBannerMode(Banner.Mode.OFF); // 可以关闭springboot启动横幅
        app.run(args);
    }

}
