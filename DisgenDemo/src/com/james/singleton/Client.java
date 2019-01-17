package com.james.singleton;
/**
 * Description:
 * 1
 * LinLearnDemo
 * Date:  2019/1/17 22:31
 *
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showInfor();
        //如下写法会报错，不能直接调用构造方法，保证单例模式
//        singleton singleton1 = new singleton();
        singleton = Singleton.getInstance();
        singleton.showInfor();
        singleton = Singleton.getInstance();
        singleton.showInfor();
    }
}
