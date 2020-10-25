package designpatterns.factory.simplefactory.simplefactory.order;

import designpatterns.factory.simplefactory.simplefactory.pizza.CheesePizza;
import designpatterns.factory.simplefactory.simplefactory.pizza.GreekPizza;
import designpatterns.factory.simplefactory.simplefactory.pizza.PepperPizza;
import designpatterns.factory.simplefactory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
