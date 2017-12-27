package less_3.cafe.beverage;

/**
 * 浓缩咖啡
 *
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:28
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
