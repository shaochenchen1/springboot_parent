package com.tulingxueyuan.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Duration;
import java.time.LocalDateTime;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 * 用来记录当前请求的执行时间
 */
public class TimeInterceptor implements HandlerInterceptor {
    LocalDateTime begin;

    Logger logger = LoggerFactory.getLogger(TimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 开始时间
        begin = LocalDateTime.now();
        logger.info("当前请求：" + request.getRequestURI() + "；开始时间：" + begin);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 结束时间
        LocalDateTime end = LocalDateTime.now();

        // 计算2个时间差
        Duration between = Duration.between(begin, end);

        // 获得相差毫秒
        long l = between.toMillis();

        logger.info("当前请求：" + request.getRequestURI() + "；执行时间：" + l + "毫秒");
    }
}
