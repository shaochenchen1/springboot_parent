package com.tulingxueyuan.config;

import org.springframework.boot.web.servlet.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Configuration
public class MyMvcAutoAconfiguration {
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        // 自己自定义一个自己想用的一个类
        return new OrderedHiddenHttpMethodFilter();
    }
}
