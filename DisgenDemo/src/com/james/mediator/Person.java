package com.james.mediator;

/**
 * Description:
 * 人
 * LinLearnDemo
 *
 * @Date: 2019/2/12 20:40
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class Person {
    protected String name;
    protected Mediator mediator;

    Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

}
