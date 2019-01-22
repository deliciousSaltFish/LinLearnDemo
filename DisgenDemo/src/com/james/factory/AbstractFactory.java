package com.james.factory;

/**
 * Description:
 * 工厂
 * LinLearnDemo
 *
 * @Date: 2019/1/21 22:07
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractFactory implements IFactory {
    protected IProducts create(Class c) {
        IProducts iProducts = null;
       if (!c.getName().equals("")) {
            try {
                iProducts=(IProducts)Class.forName(c.getName()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         return iProducts;
    }

}
