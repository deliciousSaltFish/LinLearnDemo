package com.james.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * 外部用户
 * LinLearnDemo
 *
 * @Date: 2019/1/23 20:47
 * @Author: James Lin
 * @Version: 1.0
 */

public class OutUser {
    public Map getOutID() {
        Map map = new HashMap(2);
        map.put("ID", "这里是ID");
        return map;
    }
}
