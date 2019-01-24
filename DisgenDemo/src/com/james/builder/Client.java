package com.james.builder;

import java.util.ArrayList;

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
        ArrayList<String> sequence=new ArrayList<String>();
        sequence.add("left");
        sequence.add("left");
        sequence.add("right");
        AbstractBulider one=new Tempate1();
        one.setSsquence(sequence);
        one.run();
        System.out.println("--------------------------");
        AbstractBulider two=new Template2();
        sequence.add("right");
        two.setSsquence(sequence);
        two.run();
    }
}
