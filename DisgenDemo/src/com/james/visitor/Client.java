package com.james.visitor;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/30 22:01
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        AbstractAnimal bear= new Bear("熊",100,"棕色");
        bear.accept(new Vistor());
        AbstractAnimal tiger= new Tiger("老虎",100,"花斑");
        tiger.accept(new Vistor());
    }
}
