package com.james.builder;

/**
 * Description:
 * 2号
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:46
 * @Author: James Lin
 * @Version: 1.0
 */

public class Template2 extends AbstractBulider {
    private boolean flag=true;
    @Override
    protected void right() {
        System.out.println("二号抬右脚");
    }

    @Override
    protected void left() {
        System.out.println("二号抬左脚");
    }
}
