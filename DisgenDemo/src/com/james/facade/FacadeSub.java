package com.james.facade;

/**
 * Description:
 * 提供门面
 * LinLearnDemo
 *
 * @Date: 2019/1/22 22:41
 * @Author: James Lin
 * @Version: 1.0
 */

public class FacadeSub {
    public void cook(String bugSome,String cutSome){
      Cook cook=new Cook();
      cook.bug(bugSome);
      cook.cut(cutSome);
      cook.fire();
    }
}
