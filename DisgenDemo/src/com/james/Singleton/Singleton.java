package com.james.Singleton;

public class Singleton {
    private static Singleton singleton=null;
    private String name;
    private String age;
    private String sex;
    private Singleton(String name,String age,String sex){
     this.name=name;
     this.age=age;
     this.sex=sex;
    }
    public static Singleton getSingleton(){
        if (singleton==null){
            singleton=new Singleton("James", "26", "男");
        }
        return singleton;
    }
    public  void showInfor(){
        System.out.println("----"+this.name);
    }
}
