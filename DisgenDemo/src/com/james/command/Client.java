package com.james.command;

/**
 * Description:
 * 客户开始下命令
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:12
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        AbstractCommand coder=new CoderWork();
        AbstractCommand draw=new DrawWork();
        Boss boss=new Boss();
        boss.setCommand(coder);
        boss.action();
        System.out.println("------------------");
        boss.setCommand(draw);
        boss.action();
    }
}
