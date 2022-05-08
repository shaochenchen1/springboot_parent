package com.tulingxueyuan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@SpringBootTest
@AutoConfigureMockMvc    //专门用于做mockmvc的， 由spring-test提供， 依赖junit5, 如果没有该注解需要通过代码构建MockMvc
public class MockMvcTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testMockMVCGet() throws Exception {

        // 发起一个模拟请求 ，不依赖网络，不依赖web服务，  不需要启动web应用
        mockMvc.perform(
                MockMvcRequestBuilders.get("/user/{id}", 1)  // 发送了get请求
                        .accept(MediaType.APPLICATION_JSON_UTF8) // 设置响应的文本类型
                //.param(name,value)   ?name=xx&age=xx
        )
                // 响应断言
                .andExpect(MockMvcResultMatchers.status().isOk())   // 断言状态码为200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.username").value("zhangsanxx"))
                .andDo(MockMvcResultHandlers.print());
    }


    @Test
    void testMockMVCPost() throws Exception {

        String userJson = "{\n" +
                "  \"username\": \"徐庶\",\n" +
                "  \"address\": \"mockMVC\",\n" +
                "  \"birthday\": \"2020/01/01\"\n" +
                "}";
        System.out.println(userJson);
        // 发起一个模拟请求 ，不依赖网络，不依赖web服务，  不需要启动web应用
        mockMvc.perform(
                MockMvcRequestBuilders.post("/user/add")  // 发送了get请求
                        .accept(MediaType.APPLICATION_JSON_UTF8) // 设置响应的文本类型
                        .contentType(MediaType.APPLICATION_JSON_UTF8) // 设置请求的文本类型
                        .content(userJson)          // json数据
                //.param(name,value)   ?name=xx&age=xx
        )
                // 响应断言
                .andExpect(MockMvcResultMatchers.status().isOk())   // 断言状态码为200
                //.andExpect(MockMvcResultMatchers.jsonPath("$.data.length()").value(5))
                .andDo(MockMvcResultHandlers.print());

    }
}
