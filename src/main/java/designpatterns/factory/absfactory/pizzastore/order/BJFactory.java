package designpatterns.factory.absfactory.pizzastore.order;

import designpatterns.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import designpatterns.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import designpatterns.factory.absfactory.pizzastore.pizza.Pizza;


//这是工厂子类
public class BJFactory implements AbsFactory{
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        return pizza = orderType.equals("cheese") ? new BJCheesePizza():
        orderType.equals("pepper")? new BJPepperPizza():null;
    }

}
