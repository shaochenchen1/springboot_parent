package com.tulingxueyuan.entity;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class User {
    private Integer id;
    private String username;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User(Integer id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public User(String username, String address) {
        this.username = username;
        this.address = address;
    }

    public User() {
    }
}
