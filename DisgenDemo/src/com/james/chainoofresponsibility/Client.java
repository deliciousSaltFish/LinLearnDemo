package com.james.chainoofresponsibility;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:02
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        //初始化
        BossOne bossOne=new BossOne();
        BossTwo bossTwo=new BossTwo();
        //设置责任链
        bossOne.setNextHandler(bossTwo);
        //定义两个不同的员工，根据不同员工等级，执行对应职责的方法
        IWorker iWorker=new Worker(1, "上厕所");
        bossOne.HandlerMessage(iWorker);
        iWorker=new Worker(2, "上厕所");
        bossOne.HandlerMessage(iWorker);
    }
}
