package less_3.cafe.beverage;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:29
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
