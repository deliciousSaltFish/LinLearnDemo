package com.james.bridge;

/**
 * Description:
 * 模型
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:42
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractHuman {
    private Woman woman;

    /**
     *  把想调用的其他的实例传进来，限制
     *  其子类重写该构造方法
     *
     * @param
     * @return
     * @Date: 2019/1/24-22:22
     */
    public AbstractHuman(Woman woman){
        this.woman=woman;
    }
    /**
     *  聊天
     *
     * @param
     * @return
     * @Date: 2019/1/23-21:43
     */
    public  void talk(){
        this.woman.cloth();
    };

}
