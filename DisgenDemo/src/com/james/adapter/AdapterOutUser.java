package com.james.adapter;

import java.util.Map;

/**
 * Description:
 * 外部用户的适配器
 * 将外部用户包装成普通用户
 * LinLearnDemo
 *
 * @Date: 2019/1/23 20:55
 * @Author: James Lin
 * @Version: 1.0
 */

public class AdapterOutUser extends OutUser implements IUser{
   private Map outID=super.getOutID();
    /**
     * 获取外部用户的ID
     *
     * @return String ID
     * @Date: 2019/1/23-21:02
     */
    public String id() {
        System.out.println("外部用户ID");
        return (String) outID.get("ID");
    }


}
