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
    /**
     * fetch data by rule id
     *
     * @param
     * @param
     * @return void
     */
    public IProducts createCar();
    /**
     * fetch data by rule id
     *
     * @param
     * @param
     * @return void
     */
    public IProducts createBike();
}
