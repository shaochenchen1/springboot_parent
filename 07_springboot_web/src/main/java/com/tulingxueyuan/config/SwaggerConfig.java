package com.tulingxueyuan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Configuration   // 标记为配置类
@EnableSwagger2  // 启动swagger
public class SwaggerConfig {

    /**
     * 负责接口文档的呈现  以及  接口的配置
     *
     * @return
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")   // 要将那些请求路径映射到swagger文档中
                .select()       //api选择构建器
                .apis(RequestHandlerSelectors.basePackage("com.tulingxueyuan.controller"))  // 哪个包下的http接口配置到swagger文档中
                .paths(PathSelectors.any())     //任何一个接口都配置到swagger文档中
                .build().apiInfo(new ApiInfoBuilder()
                        .title("图灵学院-springboot web开发文档")       // 当前文档标题
                        .description("SpringBoot整合Swagger，详细信息......")
                        .version("1.0.0V")
                        .contact(new Contact("徐庶", "www.tulingxueyuan.cn", "123@qq.com"))
                        .build());
    }
}
