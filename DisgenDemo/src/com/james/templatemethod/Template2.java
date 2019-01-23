package com.james.templatemethod;

/**
 * Description:
 * 2号
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:46
 * @Author: James Lin
 * @Version: 1.0
 */

public class Template2 extends AbstractTemplate {
    private boolean flag=true;
    @Override
    protected void right() {
        System.out.println("二号抬右脚");
    }

    @Override
    protected void left() {
        System.out.println("二号抬左脚");
    }
    @Override
    public boolean isLeft(){
        return flag;
    }
    public void setFlage(boolean flag){
        this.flag=flag;
    }
}
