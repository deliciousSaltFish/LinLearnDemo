package com.james.state;

/**
 * Description:
 * 上下文
 * LinLearnDemo
 *
 * @Date: 2019/1/31 21:13
 * @Author: James Lin
 * @Version: 1.0
 */

public class Context {
    public final static LiveState LIVE_STATE = new LiveState();
    public final static DeathState DEATH_STATE = new DeathState();
    public final static LifeState LIFE_STATE = new LifeState();

private AbstractPeople people;
public AbstractPeople getPeople(){
    return this.people;
}
public void setPeople(AbstractPeople people){
    this.people=people;
    this.people.setContext(this);
}
    public void live(){
    this.people.live();
    }

    public void death(){
    this.people.death();
    }

    public void life(){
    this.people.life();
    }

}
