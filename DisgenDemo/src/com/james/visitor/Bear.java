package com.james.visitor;

/**
 * Description:
 * 熊
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:52
 * @Author: James Lin
 * @Version: 1.0
 */

public class Bear extends AbstractAnimal {
    private String food="熊啥都吃";

    public Bear(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void accept(IVistor iVistor) {
        iVistor.vistor(this);
    }
}
