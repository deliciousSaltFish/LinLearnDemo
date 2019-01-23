package com.james.templatemethod;

/**
 * Description:
 * 模型
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:42
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractTemplate {
    /**
     *  抬右脚
     *
     * @param
     * @return
     * @Date: 2019/1/23-21:43
     */
    protected abstract void right();
    /**
     *抬左脚
     *
     * @param
     * @return
     * @Date: 2019/1/23-21:43
     */
    protected abstract void left();
    /**
     *跑
     *
     * @param
     * @return
     * @Date: 2019/1/23-21:43
     */
    final public  void run(){
        if (this.isLeft()){
            this.left();
        }
        this.right();
    };
    /**
     *钩子方法，默认可以抬左腿
     *
     * @param
     * @return
     * @Date: 2019/1/23-21:43
     */
    protected boolean isLeft(){
        return true;
    }
}
