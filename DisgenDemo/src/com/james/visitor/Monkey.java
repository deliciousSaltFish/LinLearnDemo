package com.james.visitor;

/**
 * Description:
 * 猴
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:53
 * @Author: James Lin
 * @Version: 1.0
 */

public class Monkey extends AbstractAnimal {
    private String food="猴子吃香蕉";

    public Monkey(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void accept(IVistor iVistor) {
        iVistor.vistor(this);
    }
    }
