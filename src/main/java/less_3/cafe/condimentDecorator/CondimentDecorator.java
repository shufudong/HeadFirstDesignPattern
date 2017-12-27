package less_3.cafe.condimentDecorator;

import less_3.cafe.beverage.Beverage;

/**
 * 调料基类
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:17
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
