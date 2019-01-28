package com.james.decorator;

/**
 * Description:
 * 物价
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:40
 * @Author: James Lin
 * @Version: 1.0
 */

public class Pirce extends Decorator{
    Pirce(Buy buy) {
        super(buy);
    }
    public  void show(){
        System.out.println("输出一下物价");
    }
    @Override
    public void buySomething(){
        this.show();
        super.buySomething();
    }
}
