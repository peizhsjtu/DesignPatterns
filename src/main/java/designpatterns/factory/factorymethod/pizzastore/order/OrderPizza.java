package designpatterns.factory.factorymethod.pizzastore.order;

import designpatterns.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public abstract class OrderPizza {
    //定义一个抽象方法,createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() throws IOException {
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            pizza = createPizza(orderType);//抽象方法,由工厂子类完成

            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();;
            pizza.cut();
            pizza.box();
        }while(true);
    }

    public String getType() throws IOException {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = strin.readLine();
        return str;
    }
}
