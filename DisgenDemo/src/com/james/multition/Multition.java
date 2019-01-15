package com.james.multition;

import java.util.ArrayList;
import java.util.Random;

public class Multition {
    private static int maxNum = 2;
    //装多例信息
    private static ArrayList multInforList = new ArrayList(maxNum);
    //装多例对象
    private static ArrayList multList = new ArrayList(maxNum);
    //实例对象数量
    private static int countNum = 0;

    static {
        //将所有实例对象都创建出来
        for (int i = 0; i < maxNum; i++) {
            multList.add(new Multition("代码"+i));
        }
    }

    private Multition() {
    }

    private Multition(String infor) {
        multInforList.add(infor);
    }
    public static Multition getInstance(){
        Random random=new Random();
        countNum=random.nextInt(maxNum);
        //随机取出一个实例
        return (Multition)multList.get(countNum);
    }
    public static void multInforList(){
        System.out.println(multInforList.get(countNum) );
    }
}
