package com.james.composite;

import java.util.ArrayList;

/**
 * Description:
 * 节点
 * LinLearnDemo
 *
 * @Date: 2019/1/28 21:53
 * @Author: James Lin
 * @Version: 1.0
 */

public class Branch extends AbstractPeople {
    ArrayList<AbstractPeople> sub=new ArrayList<AbstractPeople>();
    public Branch(String name, String age) {
        super(name, age);
    }
    public void add(AbstractPeople people){
        sub.add(people);
    }
    public ArrayList<AbstractPeople> getSub(){
        return this.sub;
    }
}
