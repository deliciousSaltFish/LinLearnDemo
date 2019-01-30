package com.james.visitor;

/**
 * Description:
 * 老虎
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:51
 * @Author: James Lin
 * @Version: 1.0
 */

public class Tiger extends AbstractAnimal {
    private String food="鸟吃香蕉";

    public Tiger(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void accept(IVistor iVistor) {
        iVistor.vistor(this);
    }
}
