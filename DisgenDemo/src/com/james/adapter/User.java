package com.james.adapter;

/**
 * Description:
 * 用户实现
 * LinLearnDemo
 *
 * @Date: 2019/1/23 20:45
 * @Author: James Lin
 * @Version: 1.0
 */

public class User implements IUser{
    public String id() {
        System.out.println("用户的ID!!");
        return "用户的ID!!";
    }
}
