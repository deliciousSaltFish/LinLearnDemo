package com.james.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.showInfor();
        //如下写法会报错，不能直接调用构造方法，保证单例模式
//        Singleton singleton1 = new Singleton();
        singleton = Singleton.getSingleton();
        singleton.showInfor();
        singleton = Singleton.getSingleton();
        singleton.showInfor();
    }
}
