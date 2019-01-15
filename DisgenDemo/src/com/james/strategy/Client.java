package com.james.strategy;

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
