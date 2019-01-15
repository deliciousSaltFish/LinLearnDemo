package com.james.strategy;

public class Context {
    private IStrategy strategy;
    //将策略传入
    public Context(IStrategy strategy){
        this.strategy=strategy;
    }
    //调用传入的策略
    public void operate(){
        this.strategy.operate();
    }
}
