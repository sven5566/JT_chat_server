package com.whr.jt.chat.server.bean;

/**
 * Created by whrr5 on 2017/6/7.
 */
public class UserTest {
    String name;
    int age;

    public UserTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
