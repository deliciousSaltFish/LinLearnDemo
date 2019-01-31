package com.james.state;

/**
 * Description:
 * 活着
 * LinLearnDemo
 *
 * @Date: 2019/1/31 21:19
 * @Author: James Lin
 * @Version: 1.0
 */

public class LiveState extends AbstractPeople {

    @Override
    public void live() {
        System.out.println("人活了");
    }
    @Override
    public void death() {
        super.context.setPeople(Context.DEATH_STATE);
        super.context.getPeople().death();
    }
    @Override
    public void life() {
        super.context.setPeople(Context.LIFE_STATE);
        super.context.getPeople().life();
    }
}
