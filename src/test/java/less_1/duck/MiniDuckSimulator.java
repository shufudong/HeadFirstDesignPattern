package less_1.duck;

import less_1.duck.impl.MallardDuck;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-19 0:19
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();;
    }
}
