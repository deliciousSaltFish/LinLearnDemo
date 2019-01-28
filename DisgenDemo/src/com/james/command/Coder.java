package com.james.command;

/**
 * Description:
 * 写代码的
 * LinLearnDemo
 *
 * @Date: 2019/1/28 19:53
 * @Author: James Lin
 * @Version: 1.0
 */

public class Coder implements IWork{
    public void goToWork() {
        System.out.println("准备写代码");
    }

    public void startWork() {
        System.out.println("开始写代码");
    }
}
