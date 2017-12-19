package less_1.duck.quack;

import less_1.duck.fly.FlyBehavlor;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-18 23:56
 */
public class MuteQuack implements QuackBehavlor {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }

}
