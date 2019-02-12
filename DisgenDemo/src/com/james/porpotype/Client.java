package com.james.porpotype;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/2/12 19:54
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
private static int MAX_COUNT=10;
    public static void main(String[] args) {
        Mail mail=new Mail(new AdvTemplate());
        mail.setReceiver("原型先生");
        System.out.println(mail.getReceiver());
        for (int i=0;i<MAX_COUNT;i++){
            //这里通过克隆缩短创建对象时间
            Mail cloneMail=mail.clone();
            cloneMail.setReceiver(i+"先生");
            System.out.println(cloneMail.getReceiver());
        }
        System.out.println(mail.getReceiver());
    }
}
