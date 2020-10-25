package designpatterns.factory.absfactory.pizzastore.order;

import designpatterns.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory absFactory;
    public OrderPizza(AbsFactory absFactory) throws IOException {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) throws IOException {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;

        do{
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while(true);
    }


    public String getType() throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = strin.readLine();
        return str;
    }
}
