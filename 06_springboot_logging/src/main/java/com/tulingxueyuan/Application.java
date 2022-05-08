package com.tulingxueyuan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Slf4j —— Lombok 依赖  看看IDE是否支持 安装插件
public class Application {

    //1.声明日志记录器
    static Logger logger=LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println(System.getProperty("PID"));
        logger.trace("跟踪");
        logger.debug("调试");
        // Springboot 默认的日志级别就是INFO
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");
    }

}
