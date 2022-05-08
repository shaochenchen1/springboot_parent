package com.tulingxueyuan.service;

import com.tulingxueyuan.entity.User;
import org.springframework.stereotype.Component;

import java.util.*;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Component
public class UserService {
    private static Map<Integer, User> users = new HashMap<>();

    static {
        users.put(1, new User(1, "zhangsan", "北京", new Date()));
        users.put(2, new User(2, "lisi", "上海"));
        users.put(3, new User(3, "wangwu", "深圳"));
        users.put(4, new User(4, "xushu", "非洲"));
        users.put(5, new User(5, "zhuge", "塔寨村"));
    }

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    public User getUserById(Integer id) {
        return users.get(id);
    }


    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> getAllUser() {
        return new ArrayList(users.values());
    }

    /**
     * 更新
     *
     * @param user
     * @return
     */
    public void update(User user) {
        users.replace(user.getId(), user);
    }


    /**
     * 新增
     *
     * @param user
     * @return
     */
    public void add(User user) {
        Integer newId = users.size() + 1;
        user.setId(newId);
        users.put(newId, user);
    }

    /**
     * 删除
     *
     * @return
     */
    public void delete(Integer id) {
        users.keySet().removeIf(key -> key == id);
    }


}
