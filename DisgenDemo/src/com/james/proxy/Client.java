package com.james.proxy;

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
