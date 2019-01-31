package com.james.state;

/**
 * Description:
 * 测试
 * LinLearnDemo
 *
 * @Date: 2019/1/31 21:50
 * @Author: James Lin
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //活着状态
        context.setPeople(new LiveState());
        //下一状态
        context.death();
        //下一状态
        context.life();
        //下一状态
        context.live();
    }
}
