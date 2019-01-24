package com.james.builder;

import java.util.ArrayList;

/**
 * Description:
 * 模型
 * LinLearnDemo
 *
 * @Date: 2019/1/23 21:42
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractBulider {
    ArrayList<String> squence;
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
    *  根据传进来的顺序执行
    *
    * @param
    * @return
    * @Date: 2019/1/24-21:38
    */
    public void run(){
        for(String str:squence){
            if("left".equals(str)){
                this.left();
            }
            if("right".equals(str)){
                this.right();
            }
        }
    }
    /**
     *  将顺序传进来
     *
     * @param
     * @return
     * @Date: 2019/1/24-21:42
     */
    public void setSsquence(ArrayList<String> ssquence){
        this.squence=ssquence;
    }
}
