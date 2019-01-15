package com.james.multition;

public class Client {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println("第"+i+"次调用");
            //固定9号获取特定实例
            if (i==9){
                Multition multition=Multition.getInstance(1);
                multition.multInforList();
            }else{
                Multition multition=Multition.getInstance();
                multition.multInforList();
            }
        }
    }
}
