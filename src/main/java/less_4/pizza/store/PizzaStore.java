package less_4.pizza.store;

import less_4.pizza.Pizza;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-28 0:40
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
