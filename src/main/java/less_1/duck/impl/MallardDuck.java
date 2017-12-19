package less_1.duck.impl;

import less_1.duck.Duck;
import less_1.duck.fly.FlyWithWings;
import less_1.duck.quack.MuteQuack;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-19 0:17
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavlor = new FlyWithWings();
        quackBehavlor = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I`m a mallard duck!");
    }
}
