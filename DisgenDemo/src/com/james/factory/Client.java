package com.james.factory;

/**
 * Description:
 * 调用
 * LinLearnDemo
 *
 * @Date: 2019/1/21 22:39
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        IFactory iFactoryBike=new BikeFactoryCreate();
        IFactory iFactoryCar=new TruckFactoryCteate();
        BlackBike bike= (BlackBike) iFactoryBike.createBike();
        BlackTruncCar truck= (BlackTruncCar) iFactoryCar.createCar();
       bike.dirve();
       bike.color();
        truck.dirve();
        truck.type();
    }
}
