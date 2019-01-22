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
        IFactory blackBikeF=new BlackFactoryCreate();
        IFactory blackCarF=new BlackFactoryCreate();
        IFactory yellowCarF=new YellowFactoryCteate();
        IFactory yellowBikeF=new YellowFactoryCteate();
        BlackBike blackbike= (BlackBike) blackBikeF.createBike();
        BlackTruncCar blacktruck= (BlackTruncCar) blackCarF.createCar();
       //后面可以继续获取黄色自行车，卡车
        blackbike.dirve();
        blackbike.color();
        blacktruck.dirve();
        blacktruck.color();
    }
}
