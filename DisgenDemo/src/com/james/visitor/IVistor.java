package com.james.visitor;

/**
 * Description:
 * 访问者
 * LinLearnDemo
 *
 * @Date: 2019/1/30 21:57
 * @Author: James Lin
 * @Version: 1.0
 */
public interface IVistor {
    /**
     * 将被访问的动物传入访问者
     *
     * @param iAnimal
     * @return
     * @Date: 2019/1/30-22:14
     */
    void vistor(AbstractAnimal iAnimal);
}
