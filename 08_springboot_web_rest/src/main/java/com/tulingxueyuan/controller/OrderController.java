package com.tulingxueyuan.controller;

import com.tulingxueyuan.entity.Result;
import com.tulingxueyuan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
public class OrderController {

    // 声明了RestTemplate
    private final RestTemplate restTemplate;

    // 当bean 没有无参构造函数的时候，spring将自动拿到有参的构造函数，参数进行自动注入
    public OrderController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @RequestMapping("/order")
    public String order(){
        // 下单   需要远程访问rest服务

        // 基于restTemplate 调用查询
        /*Result forObject = restTemplate.getForObject("http://localhost:8080/user/{id}", Result.class, 1);
        return forObject.toString();*/


        // 基于restTemplate 调用新增
       /*

        User user = new User("徐庶", "随便");

        // url: 请求的远程rest url
        // object : post请求的参数
        // Class<T>:返回的类型
        // ...Object: 是@PathVariable 占位符的参数
        ResponseEntity<Result> resultResponseEntity = restTemplate.postForEntity("http://localhost:8080/user/add", user, Result.class);
        System.out.println(resultResponseEntity.toString());
        return resultResponseEntity.getBody().toString();*/


        // 基于restTemplate 调用修改
       /* User user = new User(1,"徐庶", "随便");
        //restTemplate.put("http://localhost:8080/user/add", user, Result.class);
        HttpEntity<User> httpEntity = new HttpEntity<>(user);

        ResponseEntity<Result> resultResponseEntity = restTemplate.exchange("http://localhost:8080/user/{id}", HttpMethod.PUT, httpEntity, Result.class, 1);
        System.out.println(resultResponseEntity.toString());
        return resultResponseEntity.getBody().toString();*/



        // 基于restTemplate 调用删除
        ResponseEntity<Result> resultResponseEntity = restTemplate.exchange("http://localhost:8080/user/{id}", HttpMethod.DELETE, null, Result.class, 1);
        System.out.println(resultResponseEntity.toString());
        return resultResponseEntity.getBody().toString();
    }
}
