package com.james.strategy;

public class GiveGreenLight implements IStrategy{
    public void operate() {
        System.out.println("开绿灯");
    }
}
