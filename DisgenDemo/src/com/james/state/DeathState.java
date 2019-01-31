package com.james.state;

/**
 * Description:
 * 死亡
 * LinLearnDemo
 *
 * @Date: 2019/1/31 21:25
 * @Author: James Lin
 * @Version: 1.0
 */

public class DeathState extends AbstractPeople {
    @Override
    public void live() {
        super.context.setPeople(Context.LIVE_STATE);
        super.context.getPeople().live();
    }
    @Override
    public void death() {
        System.out.println("人死了");
//        super.context.setPeople(Context.DEATH_STATE);
//        super.context.getPeople().death();
    }
    @Override
    public void life() {
        super.context.setPeople(Context.LIFE_STATE);
        super.context.getPeople().life();
    }
}
