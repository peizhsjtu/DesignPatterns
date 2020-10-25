package designpatterns.factory.simplefactory.pizzastore.order;

import designpatterns.factory.simplefactory.pizzastore.pizza.CheesePizza;
import designpatterns.factory.simplefactory.pizzastore.pizza.GreekPizza;
import designpatterns.factory.simplefactory.pizzastore.pizza.PepperPizza;
import designpatterns.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
    //违反了开闭原则,不利于代码扩展
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" 芝士披萨 ");
            } else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName(" 胡椒披萨 ");
            } else {
                break;
            }
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

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
