package com.james.command;

/**
 * Description:
 * 项目经理
 * LinLearnDemo
 *
 * @Date: 2019/1/28 19:52
 * @Author: James Lin
 * @Version: 1.0
 */

public class Boss {
    private AbstractCommand command;
    public void setCommand( AbstractCommand command){
        this.command=command;
    }
    public void action(){
        this.command.excute();
    }
}
