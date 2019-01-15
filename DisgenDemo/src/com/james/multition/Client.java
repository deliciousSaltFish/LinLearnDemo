package com.james.multition;

public class Client {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println("第"+i+"次调用");
            Multition multition=Multition.getInstance();
            multition.multInforList();
        }
    }
}
