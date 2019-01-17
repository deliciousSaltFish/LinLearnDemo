package com.james.strategy;
/**
 * Description:
 * 1
 * LinLearnDemo
 * Date:  2019/1/17 22:31
 *
 * @Author: James Lin
 * @Version: 1.0
 */

public class GiveGreenLight implements IStrategy{
    public void operate() {
        System.out.println("开绿灯");
    }
}
