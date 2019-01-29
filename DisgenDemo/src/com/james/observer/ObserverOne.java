package com.james.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Description:
 * 观察者1
 * LinLearnDemo
 *
 * @Date: 2019/1/29 21:55
 * @Author: James Lin
 * @Version: 1.0
 */

public class ObserverOne implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("James在说话了"+o.hasChanged());
        this.report(arg.toString());
        System.out.println("听听");
    }

    private void report(String arg) {
        System.out.println("------"+arg);
    }
}
