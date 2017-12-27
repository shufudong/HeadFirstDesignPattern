package less_3.cafe.condimentDecorator;

import less_3.cafe.beverage.Beverage;

/**
 * 摩卡
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:42
 */
public class Mocha extends CondimentDecorator {

    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
