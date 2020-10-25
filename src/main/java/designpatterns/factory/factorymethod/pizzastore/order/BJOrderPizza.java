package designpatterns.factory.factorymethod.pizzastore.order;

import designpatterns.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import designpatterns.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import designpatterns.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.IOException;

public class BJOrderPizza extends OrderPizza{
    public BJOrderPizza() throws IOException {
        super();
    }
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
