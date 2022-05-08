package com.tulingxueyuan.config;

import com.tulingxueyuan.controller.CustomErrorController;
import com.tulingxueyuan.interceptors.TimeInterceptor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.stream.Collectors;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
//@EnableWebMvc    加了这个会使Springmvc自动配置失效
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    /**
     * 添加视图控制器
     * 立即访问
     * <mvc:view-controller path="/" view-name="index" />
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/tuling").setViewName("hello");
    }

    /**
     * 添加拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TimeInterceptor())     //添加拦截器
                .addPathPatterns("/**")    // 拦截映射规则
                .excludePathPatterns("/pages/**");  // 设置排除的映射规则

        // 添加国际化拦截器
        registry.addInterceptor(new LocaleChangeInterceptor())
                .addPathPatterns("/**");    // 拦截映射规则
    }

    /**
     * 全局CORS配置
     *
     * @param
     * @Override public void addCorsMappings(CorsRegistry registry) {
     * registry.addMapping("/user/*")   // 映射服务器中那些http接口运行跨域访问
     * .allowedOrigins("http://localhost:8081")     // 配置哪些来源有权限跨域
     * .allowedMethods("GET","POST","DELETE","PUT");   // 配置运行跨域访问的请求方法
     * }
     */


    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        // 可以设置过期时间
        cookieLocaleResolver.setCookieMaxAge(60 * 60 * 24 * 30);
        cookieLocaleResolver.setCookieName("locale");
        return cookieLocaleResolver;
    }


}
