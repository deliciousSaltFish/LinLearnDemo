package com.james.factory;

/**
 * Description:
 * 卡车工厂
 * LinLearnDemo
 *
 * @Date: 2019/1/21 22:38
 * @Author: James Lin
 * @Version: 1.0
 */

public class TruckFactoryCteate extends AbstractFactory {
    public IProducts createCar() {
        return super.create(BlackTruncCar.class);
    }

    public IProducts createBike() {
        return super.create(YellowTruckCar.class);
    }
}
