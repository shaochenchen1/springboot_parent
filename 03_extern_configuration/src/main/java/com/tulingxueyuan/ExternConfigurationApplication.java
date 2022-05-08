package com.tulingxueyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
@PropertySource("classpath:appSource.properties")
public class ExternConfigurationApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication springApplication = new SpringApplication(ExternConfigurationApplication.class);

        // 创建Properties
        Properties properties = new Properties();
        // 通过当前类的ClassLoader
        InputStream is= ExternConfigurationApplication.class.getClassLoader()
                .getResourceAsStream("app.properties");
        // 将输入流读取成properties
        properties.load(is);

        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }

}
