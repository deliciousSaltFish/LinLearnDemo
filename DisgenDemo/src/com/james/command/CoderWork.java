package com.james.command;

/**
 * Description:
 * 按照需求开始写代码吧
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:01
 * @Author: James Lin
 * @Version: 1.0
 */

public class CoderWork extends AbstractCommand {
    @Override
    public void excute() {
        super.coder.goToWork();
        super.coder.startWork();
    }
}
