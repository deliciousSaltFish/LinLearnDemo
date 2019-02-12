package com.james.mediator;

/**
 * Description:
 * 房东
 * LinLearnDemo
 *
 * @Date: 2019/2/12 20:41
 * @Author: James Lin
 * @Version: 1.0
 */

public class HouseOwner extends Person{

    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @desc 与中介者联系
     * @param message
     * @return void
     */
    public void constact(String message){
        mediator.constact(message, this);
    }

    /**
     * @desc 获取信息
     * @param message
     * @return void
     */
    public void getMessage(String message){
        System.out.println("房主:" + name +",获得信息：" + message);
    }
}
