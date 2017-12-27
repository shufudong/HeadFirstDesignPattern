package less_3.cafe.beverage;

/**
 * 深焙咖啡
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:37
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
