package com.james.chainoofresponsibility;

/**
 * Description:
 * 责任链分配
 * LinLearnDemo
 *
 * @Date: 2019/1/30 20:45
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractHandler {
    /**
     * 能处理的级别
     *
     * @param
     * @return
     * @Date: 2019/1/30-20:45
     */
    private int level = 0;
    /**
     * 下一个处理人
     *
     * @param
     * @return
     * @Date: 2019/1/30-20:45
     */
    private AbstractHandler nextHandler;

    public AbstractHandler(int i) {
        this.level = i;
    }

    /**
     * 发现处理请求
     *
     * @param
     * @return
     * @Date: 2019/1/30-20:45
     */
    public final void handlerMessage(IWorker iWorker) {
        if (this.level == iWorker.getType()) {
            this.response(iWorker);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(iWorker);
            } else {
                System.out.println("后面没人可以处理了");
            }
        }

    }

    public void setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 做出响应
     *
     * @param iWorker 将需要响应的员工传入
     * @return
     * @Date: 2019/1/30-21:09
     */
    protected abstract void response(IWorker iWorker);

}
