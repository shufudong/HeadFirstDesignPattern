package less_3.cafe.beverage;

/**
 * 饮料基类
 *
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:14
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
