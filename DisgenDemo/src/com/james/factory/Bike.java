package com.james.factory;

/**
 * Description:
 * 自行车
 * LinLearnDemo
 *
 * @Date: 2019/1/21 22:06
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class Bike implements IProducts{

    public void dirve() {
        System.out.println("我是一辆自行车，可以骑！");
    }
}
