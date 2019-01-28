package com.james.composite;

/**
 * Description:
 * 人
 * LinLearnDemo
 *
 * @Date: 2019/1/28 21:50
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractPeople {
    private String name="";
    private String age="";
    public AbstractPeople(String name, String age){
        this.name=name;
        this.age=age;
    }
    public String getInfo(){
      return"名字是"+this.name+"---年龄是"+this.age+"";
    }
}
