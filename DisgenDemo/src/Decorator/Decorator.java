package Decorator;

/**
 * Description:
 * 装饰接口
 * LinLearnDemo
 *
 * @Date: 2019/1/28 20:37
 * @Author: James Lin
 * @Version: 1.0
 */
public class Decorator extends Buy{
    Buy buy ;
    Decorator(Buy buy){
    this.buy=buy;
    }
    @Override
    public void buySomething(){
        this.buy.buySomething();
    }
}
