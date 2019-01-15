package com.james.proxy;

public class ProxyOne implements  KindOfThing{
   private KindOfThing proxy;

    public ProxyOne(KindOfThing kindOfThing) {
        //可以特别声明做一号的代理
        this.proxy = kindOfThing;
    }
    public ProxyOne() {
        //默认是做二号的代理
        this.proxy = new ThingTwo();
    }

    public void run() {
        this.proxy.run();
    }

    public void fly() {
        this.proxy.fly();

    }
}
