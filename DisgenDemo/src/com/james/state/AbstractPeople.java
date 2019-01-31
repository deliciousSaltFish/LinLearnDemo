package com.james.state;


/**
 * Description:
 * 人
 * LinLearnDemo
 *
 * @Date: 2019/1/31 21:11
 * @Author: James Lin
 * @Version: 1.0
 */

public abstract class AbstractPeople {
    /**
     *  环境
     *
     * @param
     * @return
     * @Date: 2019/1/31-21:57
     */
    protected Context context;
    /**
     *  设置环境
     *
     * @param
     * @return
     * @Date: 2019/1/31-21:57
     */
    public void setContext(Context context){
        this.context=context;
    }
    /**
     *  活着
     *
     * @param
     * @return
     * @Date: 2019/1/31-21:58
     */
    public abstract void live() ;
    /**
     *  死亡
     *
     * @param
     * @return
     * @Date: 2019/1/31-21:58
     */
    public abstract void death();
    /**
     *  生活
     *
     * @param
     * @return
     * @Date: 2019/1/31-21:58
     */
    public abstract void life() ;
}
