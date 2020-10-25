package designpatterns.factory.factorymethod.pizzastore.order;

import designpatterns.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import designpatterns.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import designpatterns.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.IOException;

public class LDOrderPizza extends OrderPizza{
    public LDOrderPizza() throws IOException {
        super();
    }

    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
