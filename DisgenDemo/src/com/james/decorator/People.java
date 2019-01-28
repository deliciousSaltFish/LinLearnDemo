package com.james.decorator;

/**
 * Description:
 * 我
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:43
 * @Author: James Lin
 * @Version: 1.0
 */

public class People {
    public static void main(String[] args) {
        Buy buy=new Buy();
        buy=new Pirce(buy);
        buy=new DoSomething(buy);
        buy.buySomething();
    }
}
