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

public class Context {
    private IStrategy strategy;
    /**
     *
     * 将策略传入
     *
     */
    public Context(IStrategy strategy){
        this.strategy=strategy;
    }
    /**
     * find by id
     *
     * @param
     * @return void
     */
    public void operate(){
        this.strategy.operate();
    }
}
