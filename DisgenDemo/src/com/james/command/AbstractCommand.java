package com.james.command;

/**
 * Description:
 * 命令
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:06
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractCommand{
protected Coder coder=new Coder();
protected Draw draw=new Draw();

    /**
     * 开始工作吧
     *
     * @param
     * @return
     * @Date: 2019/1/28-20:00
     */
    abstract public void excute() ;
}
