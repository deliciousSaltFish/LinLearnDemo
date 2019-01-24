package com.james.bridge;

/**
 * Description:
 * 1号
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:43
 * @Author: James Lin
 * @Version: 1.0
 */

public class Man extends Human {
    /**
     * 把想调用的其他的实例传进来，限制
     * 其子类重写该构造方法
     *
     * @param woman@return
     * @Date: 2019/1/24-22:22
     */
    public Man(Woman woman) {
        super(woman);
    }

    @Override
    public  void talk(){
        super.talk();
        System.out.println("男人聊天");
    };
}
