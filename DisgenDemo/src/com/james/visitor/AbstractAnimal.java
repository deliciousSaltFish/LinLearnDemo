package com.james.visitor;

/**
 * Description:
 * 动物
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:50
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractAnimal {
    private String name;
    private int weight;
    private String color;

    public AbstractAnimal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     *  允许访问者访问
     *
     * @param iVistor 访问者
     * @return
     * @Date: 2019/1/30-21:55
     */
    public abstract void accept(IVistor iVistor);

}
