package com.james.visitor;

/**
 * Description:
 * 实例化访问者
 * LinLearnDemo
 *
 * @Date: 2019/1/30 22:02
 * @Author: James Lin
 * @Version: 1.0
 */

public class Vistor implements IVistor{
    public void vistor(AbstractAnimal iAnimal) {
        System.out.println(this.getInfor(iAnimal));
    }

    private String getInfor(AbstractAnimal iAnimal) {
        return "我看到了："+iAnimal.getName();
    }
}
