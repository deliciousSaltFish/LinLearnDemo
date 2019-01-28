package Decorator;

/**
 * Description:
 * 干点别的
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:48
 * @Author: James Lin
 * @Version: 1.0
 */

public class DoSomething extends Decorator {
    DoSomething(Buy buy) {
        super(buy);
    }
    public void doThing(){
        System.out.println("干点别的");
    }
    @Override
    public void buySomething(){
        this.doThing();
        super.buySomething();
    }
}
