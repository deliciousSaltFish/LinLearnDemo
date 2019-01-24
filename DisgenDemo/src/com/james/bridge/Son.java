package com.james.bridge;

/**
 * Description:
 * 儿子
 * LinLearnDemo
 *
 * @Date: 2019/1/24 22:28
 * @Author: James Lin
 * @Version: 1.0
 */

public class Son extends Man {

    /**
     * 把想调用的其他的实例传进来，限制
     * 其子类重写该构造方法
     *
     * @param woman @return
     * @Date: 2019/1/24-22:22
     */
    public Son(Woman woman) {
        super(woman);
    }
}
