package designpatterns.factory.absfactory.pizzastore;

import designpatterns.factory.absfactory.pizzastore.order.BJFactory;
import designpatterns.factory.absfactory.pizzastore.order.OrderPizza;

import java.io.IOException;

public class PizzaStroe {
    public static void main(String[] args) throws IOException {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
