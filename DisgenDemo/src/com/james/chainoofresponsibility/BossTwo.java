package com.james.chainoofresponsibility;

/**
 * Description:
 * 二号
 * LinLearnDemo
 *
 * @Date: 2019/1/30 20:56
 * @Author: James Lin
 * @Version: 1.0
 */

public class BossTwo extends AbstractHandler {
    public BossTwo() {
        super(2);
    }
@Override
    protected void response(IWorker iWorker) {
    System.out.println("等级不足，给二老板审批，二老板同意了！");
    }
}
