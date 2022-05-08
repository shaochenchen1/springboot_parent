package com.tulingxueyuan.config;

import com.tulingxueyuan.servlet.BeanServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Configuration
public class MyWebMvcConfigurer  {

    @Bean
    public ServletRegistrationBean myServlet(){
        // 声明一个servlet注册器Bean
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        // 设置相应的servlet
        servletRegistrationBean.setServlet(new BeanServlet());
        // 设置名字
        servletRegistrationBean.setName("BeanServlet");
        // 添加映射规则
        servletRegistrationBean.addUrlMappings("/BeanServlet");
        return servletRegistrationBean;

    }
}
