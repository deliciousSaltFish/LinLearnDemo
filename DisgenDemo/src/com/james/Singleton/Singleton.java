package com.james.Singleton;

public class Singleton {
    //解决1.中的问题，可以使用锁
    private static Singleton singleton = new Singleton("James", "26", "男");
    private String name;
    private String age;
    private String sex;

    private Singleton(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //解决1.中的问题，可以使用锁
    public synchronized static Singleton getInstance() {
        return singleton;
    }

//1.如下方法会同时调用，判断条件会出现问题，可能会出现同时存在两个单例对象的情况
//    public static Singleton getSingleton(){
//        if (singleton==null){
//            singleton=new Singleton("James", "26", "男");
//        }
//        return singleton;
//    }

    public void showInfor() {
        System.out.println("----" + this.name);
    }
}
