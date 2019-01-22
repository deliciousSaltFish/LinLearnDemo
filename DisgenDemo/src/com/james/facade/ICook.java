package com.james.facade;

/**
 * Description:
 * 做饭
 * LinLearnDemo
 *
 * @Date: 2019/1/22 22:21
 * @Author: James Lin
 * @Version: 1.0
 */
public interface ICook {
    /**
     *  买菜
     * 
     * @param bugSome
     * @return void 
     */
    public void bug(String bugSome);

    /**
     * 切菜
     * 
     * @param cutSome
     * @return void
     */
    public void cut(String cutSome);

    /**
     * 烧火
     * 
     * @return void
     */
    public void fire();

}
