package designpatterns.factory.absfactory.pizzastore.order;

import designpatterns.factory.absfactory.pizzastore.pizza.*;


//这是工厂子类
public class LDFactory implements AbsFactory{
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        return pizza = orderType.equals("cheese") ? new LDCheesePizza():
        orderType.equals("pepper")? new LDPepperPizza():null;
    }
}
