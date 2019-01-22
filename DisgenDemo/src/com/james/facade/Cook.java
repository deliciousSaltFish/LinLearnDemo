package com.james.facade;

/**
 * Description:
 * 实现做饭
 * LinLearnDemo
 *
 * @Date: 2019/1/22 22:39
 * @Author: James Lin
 * @Version: 1.0
 */

public class Cook implements ICook{
    public void bug(String bugSome) {
        System.out.println("买菜:"+bugSome);
    }

    public void cut(String cutSome) {
        System.out.println("切菜:"+cutSome);
    }

    public void fire() {
        System.out.println("烧火!!Fire!!!");
    }
}
