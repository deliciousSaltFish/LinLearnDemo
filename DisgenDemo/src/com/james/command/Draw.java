package com.james.command;

/**
 * Description:
 * 画图的
 * LinLearnDemo
 *
 * @Date: 2019/1/28 19:53
 * @Author: James Lin
 * @Version: 1.0
 */

public class Draw implements IWork {
    public void goToWork() {
        System.out.println("准备画图了");
    }

    public void startWork() {
        System.out.println("开始画图了");
    }
}
