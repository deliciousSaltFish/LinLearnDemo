package com.james.observer;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/29 22:00
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        ObserverOne one=new ObserverOne();
        MyObservable observable=new MyObservable();
        observable.addObserver(one);
        observable.talk();
        System.out.println("讲完了，思考中。。。。");
        observable.thing();
        System.out.println("思考中，玩会！！哈哈哈哈");
    }
}
