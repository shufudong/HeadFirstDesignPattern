package less_1.duck.fly;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-18 23:54
 */
public class FlyNoWay implements FlyBehavlor {

    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
