package com.james.factory;

/**
 * Description:
 * 自行车工厂
 * LinLearnDemo
 *
 * @Date: 2019/1/21 22:28
 * @Author: James Lin
 * @Version: 1.0
 */

public class BikeFactoryCreate extends Factory{
    public IProducts createCar() {
        return super.create(BlackTruncCar.class);
    }

    public IProducts createBike() {
        return super.create(BlackBike.class);
    }
}
