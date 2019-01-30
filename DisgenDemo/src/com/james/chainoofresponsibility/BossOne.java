package com.james.chainoofresponsibility;

/**
 * Description:
 * 一号
 * LinLearnDemo
 *
 * @Date: 2019/1/30 20:53
 * @Author: James Lin
 * @Version: 1.0
 */

public class BossOne extends AbstractHandler {
    public BossOne(){
        super(1);

    }
    @Override
    protected void response(IWorker iWorker) {
        System.out.println("大老板同意了！");
    }
}
