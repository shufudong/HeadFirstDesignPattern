package less_1.duck;

import less_1.duck.fly.FlyBehavlor;
import less_1.duck.quack.QuackBehavlor;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-19 0:02
 */
public abstract class Duck {

    public FlyBehavlor flyBehavlor;
    public QuackBehavlor quackBehavlor;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavlor.fly();
    }

    public void performQuack() {
        quackBehavlor.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }
}
