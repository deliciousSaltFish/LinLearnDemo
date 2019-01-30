package com.james.visitor;

/**
 * Description:
 * 鸟
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:53
 * @Author: James Lin
 * @Version: 1.0
 */

public class Bird extends AbstractAnimal {
    private String food="鸟啥都吃";
    public Bird(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void accept(IVistor iVistor) {
        iVistor.vistor(this);
    }
}
