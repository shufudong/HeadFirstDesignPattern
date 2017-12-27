package less_3;

import less_3.cafe.beverage.Beverage;
import less_3.cafe.beverage.DarkRoast;
import less_3.cafe.beverage.Espresso;
import less_3.cafe.beverage.HouseBlend;
import less_3.cafe.condimentDecorator.MilkBubble;
import less_3.cafe.condimentDecorator.Mocha;
import less_3.cafe.condimentDecorator.SoybeanMilk;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-25 23:58
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ",$:" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new MilkBubble(beverage1);
        System.out.println(beverage1.getDescription() + ",$:" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new SoybeanMilk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new MilkBubble(beverage2);
        System.out.println(beverage2.getDescription() + ",$:" + beverage2.cost());
    }
}
