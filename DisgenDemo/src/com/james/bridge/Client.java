package com.james.bridge;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/24 22:28
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        ChinesWoman chinesWoman=new ChinesWoman();
        FreignWoman freignWoman=new FreignWoman();
        //可以根据传入Woman的实例不同，调用不同的方法，
        //方便调整
        Human man=new Man(chinesWoman) ;
        Human son=new Son(chinesWoman) ;
        man.talk();
        son.talk();
    }
}
