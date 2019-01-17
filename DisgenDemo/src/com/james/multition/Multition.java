package com.james.multition;

import java.util.ArrayList;
import java.util.Random;
/**
 * Description:
 * 1
 * LinLearnDemo
 * Date:  2019/1/17 22:31
 *
 * @Author: James Lin
 * @Version: 1.0
 */

public class Multition {
    private static int maxNum = 10;

    /**
     *
     *装多例信息
     *
     */
    private static ArrayList multInforList = new ArrayList(maxNum);
    /**
     *
     *装多例对象
     *
     */
    private static ArrayList multList = new ArrayList(maxNum);
    /**
     *
     *实例对象数量
     *
     */
    private static int countNum =0;

    static {
        //将所有实例对象都创建出来
        for (int i = 0; i < maxNum; i++) {
            multList.add(new Multition("代码"+i));
            System.out.println(i);
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
        System.out.println("实例："+countNum);
        //随机取出一个实例
        return (Multition)multList.get(countNum);
    }
    public static Multition getInstance(int num){
        //随机取出一个实例
        System.out.println("实例："+countNum);
        return (Multition)multList.get(num);
    }
//    public static void multInforList(){
//        System.out.println(multInforList.get(countNum) );
//    }

    public static void main(String[] args) {
        Multition m= getInstance();
        getInstance();
        getInstance();
        System.out.println(m);
    }
}
