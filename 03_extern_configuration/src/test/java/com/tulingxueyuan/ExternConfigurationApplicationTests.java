package com.tulingxueyuan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:appSource.properties")
class ExternConfigurationApplicationTests {

    @Value("${server.port}")
    private String port;

    @Test
    void contextLoads() {
        System.out.println(port);
    }

}
