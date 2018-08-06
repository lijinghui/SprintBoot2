package com.lneoi.springboot2.demo.entity;

/**
 * @author Lneoi.li
 * @date 2018年8月6日$ 19点18分$
 *   User 实体
 **/
public class User {
    private Long id;
    private  String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
