package com.james.templatemethod;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:47
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        Tempate1 one=new Tempate1();
        one.run();
        System.out.println("--------------------------");
        Template2 two=new Template2();
        //二号控制是否抬左脚
        two.setFlage(false);
        two.run();
    }
}
