package com.james.strategy;

public class Client {
    public static void main(String[] args){
        Context context;
        context=new Context(new BackDoor());
        context.operate();
        context=new Context(new GiveGreenLight());
        context.operate();
    }
}
