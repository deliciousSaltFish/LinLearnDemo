package com.james.mediator;

/**
 * Description:
 * 中介者接口
 * LinLearnDemo
 *
 * @Date: 2019/2/12 20:40
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class Mediator {
    /**
     *  申明一个联络方法
     *
     * @param
     * @return
     * @Date: 2019/2/12-20:43
     */
    public abstract void constact(String message,Person person);
}