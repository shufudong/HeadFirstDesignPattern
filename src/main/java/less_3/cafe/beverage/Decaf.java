package less_3.cafe.beverage;

/**
 * 低咖啡因
 *
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:41
 */
public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
