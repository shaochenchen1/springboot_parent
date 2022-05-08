package com.tulingxueyuan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 *
 * 可以通过@Value +SPEL 直接绑定springboot配置文件中的值
 *
 *
 @ConfigurationProperties 作用 常用于bean属性和yml配置文件的绑定
    prefix  可以指定配置文件中某一个节点，该节点中的子节点将自动和属性进行绑定
    @Value都支持jsr-303数据校验：@Validated
 */
@Component
@ConfigurationProperties(prefix="user")
@Validated
@PropertySource("classpath:data/user.properties")
public class User {
    private String username;
    private Integer age;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer,String> girlFriend;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGirlFriend() {
        return girlFriend;
    }

    public void setGirlFriend(Map<Integer, String> girlFriend) {
        this.girlFriend = girlFriend;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", girlFriend=" + girlFriend +
                ", address=" + address +
                '}';
    }
}
