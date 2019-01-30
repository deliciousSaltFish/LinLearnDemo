package com.james.chainoofresponsibility;

/**
 * Description:
 * 工人
 * LinLearnDemo
 *
 * @Date: 2019/1/30 20:57
 * @Author: James Lin
 * @Version: 1.0
 */

public class Worker implements IWorker {
    String context;
    int type;
    public Worker(int i,String context){
       this.context= context;
       type=i;
    }

    public int getType() {
        return this.type;
    }
}
