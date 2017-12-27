package less_3.cafe.condimentDecorator;

import less_3.cafe.beverage.Beverage;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:51
 */
public class MilkBubble extends CondimentDecorator {

    protected Beverage beverage;

    public MilkBubble(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",milk bubble";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
