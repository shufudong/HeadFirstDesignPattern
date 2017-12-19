package less_1.duck.impl;

import less_1.duck.Duck;
import less_1.duck.fly.FlyNoWay;
import less_1.duck.quack.Quack;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-19 0:09
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavlor = new FlyNoWay();
        quackBehavlor = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck!");
    }

}
