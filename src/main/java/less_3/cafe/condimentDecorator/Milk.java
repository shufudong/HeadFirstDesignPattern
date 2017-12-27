package less_3.cafe.condimentDecorator;

import less_3.cafe.beverage.Beverage;

/**
 * 牛奶
 *
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:45
 */
public class Milk extends CondimentDecorator {

    protected Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",milk";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
