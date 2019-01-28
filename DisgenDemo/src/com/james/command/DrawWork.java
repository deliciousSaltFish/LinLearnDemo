package com.james.command;

/**
 * Description:
 * 开始画画吧
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:10
 * @Author: James Lin
 * @Version: 1.0
 */

public class DrawWork extends AbstractCommand {
    @Override
    public void excute() {
        super.draw.goToWork();
        super.draw.startWork();
    }
}
