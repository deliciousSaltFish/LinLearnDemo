package com.james.multition;
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
    private static int num=10;
    public static void main(String[] args) {
        for (int i = 0; i < num; i++) {
            System.out.println("第" + i + "次调用");
            //固定9号获取特定实例
            if (i == 9) {
                Multition multition = Multition.getInstance(1);
            } else {
                Multition multition = Multition.getInstance();
            }
        }
    }
}
