package less_3.cafe.condimentDecorator;

import less_3.cafe.beverage.Beverage;

/**
 * 豆浆
 *
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:47
 */
public class SoybeanMilk extends CondimentDecorator {

    protected Beverage beverage;

    public SoybeanMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",soybean milk";
    }

    @Override
    public double cost() {
        return 0.15;
    }
}
