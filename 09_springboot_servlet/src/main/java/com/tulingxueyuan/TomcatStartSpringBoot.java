package com.tulingxueyuan;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
// 当tomcat启动时就会调用configure方法， 从而在springboot启动类的基础启动springboot
// 什么时候调用？
public class TomcatStartSpringBoot extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
