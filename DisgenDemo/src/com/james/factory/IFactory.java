package com.james.factory;

/**
 * Description:
 * 工厂接口
 * LinLearnDemo
 *
 * @Date: 2019/1/21 22:13
 * @Author: James Lin
 * @Version: 1.0
 */
public interface IFactory {
    /**创建
     */
    public IProducts createCar();
    /**创建
     */
    public IProducts createBike();
}
