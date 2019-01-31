package com.james.state;

/**
 * Description:
 * 生活
 * LinLearnDemo
 *
 * @Date: 2019/1/31 21:26
 * @Author: James Lin
 * @Version: 1.0
 */

public class LifeState extends AbstractPeople {
    @Override
    public void live() {
        super.context.setPeople(Context.LIVE_STATE);
        super.context.getPeople().live();
    }
    @Override
    public void death() {
        super.context.setPeople(Context.DEATH_STATE);
        super.context.getPeople().death();
    }
    @Override
    public void life() {
        System.out.println("继续生活");
//        super.context.setPeople(Context.LIFE_STATE);
//        super.context.getPeople().life();
    }
}
