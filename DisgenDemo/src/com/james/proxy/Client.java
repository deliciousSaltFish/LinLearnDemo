package com.james.proxy;
/**
 * Description:
 * 1
 * LinLearnDemo
 * Date:  2019/1/17 22:31
 *
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        KindOfThing thing=new ThingOne();
        //先使用默認代理
        ProxyOne proxyOne=new ProxyOne();
        System.out.println("先使用默認代理");
        proxyOne.run();
        proxyOne.fly();
        //再使用一號代理
        proxyOne=new ProxyOne(thing);
        System.out.println("再使用一號代理");
        proxyOne.run();
        proxyOne.fly();
    }
}
