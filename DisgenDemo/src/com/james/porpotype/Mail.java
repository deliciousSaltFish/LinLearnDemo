package com.james.porpotype;

/**
 * Description:
 * 邮件
 * LinLearnDemo
 *
 * @Date: 2019/2/12 19:48
 * @Author: James Lin
 * @Version: 1.0
 */

public class Mail implements Cloneable {
    private String receiver;
    private String name;
    private String context;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvcontext();
    }

    //重写Clone，不通过构造方法，直接拷贝mail，省去执行构造方法得时间
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
