package com.james.adapter;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:03
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {

    public static void main(String[] args) {
        User user =new User();
        user.id();
        IUser outuser=new AdapterOutUser();
        outuser.id();
    }
}
