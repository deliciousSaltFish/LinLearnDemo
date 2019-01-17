package com.james.strategy;
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
    public static void main(String[] args){
        Context context;
        //调用第一个策略
        context=new Context(new BackDoor());
        context.operate();
        //调用第二个策略
        context=new Context(new GiveGreenLight());
        context.operate();
        context=new Context(new LinComing());
        context.operate();
    }

}
