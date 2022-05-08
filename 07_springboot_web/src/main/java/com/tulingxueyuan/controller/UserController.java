package com.tulingxueyuan.controller;


import com.tulingxueyuan.entity.Result;
import com.tulingxueyuan.entity.User;
import com.tulingxueyuan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@Api("用户接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    MessageSource messageSource;

    //Rest  /user/1
    @GetMapping("/{id}")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "无", required = true)
    public Result getUser(@PathVariable Integer id) {
        //int a = 1 / 0;
        //LocaleContextHolder 就是一个Locale持有器  springmvc底层会自动将LocalResovler中语言设置进去
        String messge = messageSource.getMessage("user.query.success", null, LocaleContextHolder.getLocale());

        User user = userService.getUserById(id);
        return new Result<>(200, messge, user);
    }

    // 新增 /user/add
    @PostMapping("/add")
    @ApiOperation("添加用户")
    @ApiImplicitParam(name = "user", value = "User实体json", defaultValue = "无", required = true)
    public Result addUser(@RequestBody User user) {

        System.out.println(user);
        userService.add(user);
        return new Result<>(200, "添加成功", userService.getAllUser());
    }

    // 修改 /user1
    @PutMapping("/{id}")
    public Result editUser(@RequestBody User user) {
        userService.update(user);
        return new Result<>(200, "修改成功", userService.getAllUser());
    }

    // 删除 /user1
    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:8081")
    public Result deleteUser(@PathVariable Integer id) {
        userService.delete(id);
        return new Result<>(200, "删除成功", userService.getAllUser());
    }

}
