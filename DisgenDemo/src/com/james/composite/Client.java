package com.james.composite;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/28 21:56
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {


    public static void main(String[] args) {
        Branch peopleA=new Branch("A","12") ;
        Branch peopleB=new Branch("B","12") ;
        Branch peopleC=new Branch("C","12") ;
        Leaf a=new Leaf("a", "12");
        Leaf b=new Leaf("b", "12");
        Leaf c=new Leaf("c", "12");
        peopleA.add(a);
        peopleA.add(peopleB);
        peopleA.add(peopleC);
        peopleB.add(b);
        peopleB.add(c);
        System.out.println("A:"+getSubInfo(peopleA));
    }
    public static String getSubInfo(Branch branch){
        String info="";
        //前序遍历
        for (AbstractPeople i :branch.getSub()){
            if (i instanceof Branch){
                info+=i.getInfo()+"\n"+getSubInfo((Branch)i);
            }else{
                info+=i.getInfo()+"\n";
            }
        }
        return info;
    }
}
