package com.james.observer;

/**
 * Description:
 * 被观察者
 * LinLearnDemo
 *
 * @Date: 2019/1/29 21:52
 * @Author: James Lin
 * @Version: 1.0
 */

public class MyObservable extends java.util.Observable {
    public void thing(){
        System.out.println("我在思考");
        //标记开始行动
        super.setChanged();
        //提醒观察者
        super.notifyObservers("在思考");
    }
public void talk(){
    System.out.println("我在讲话");
    super.setChanged();
    super.notifyObservers("在讲话");
}
}
