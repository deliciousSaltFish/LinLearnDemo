package com.james.templatemethod;

/**
 * Description:
 * 1号
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:43
 * @Author: James Lin
 * @Version: 1.0
 */

public class Tempate1 extends AbstractTemplate {
    @Override
    protected void right() {
        System.out.println("一号抬右脚");
    }

    @Override
    protected void left() {
        System.out.println("一号抬左脚");
    }
    @Override
    public boolean isLeft(){
        return false;
    }
}
