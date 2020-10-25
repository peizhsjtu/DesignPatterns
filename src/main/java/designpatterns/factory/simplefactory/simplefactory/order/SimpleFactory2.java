package designpatterns.factory.simplefactory.simplefactory.order;

import designpatterns.factory.simplefactory.simplefactory.pizza.CheesePizza;
import designpatterns.factory.simplefactory.simplefactory.pizza.GreekPizza;
import designpatterns.factory.simplefactory.simplefactory.pizza.PepperPizza;
import designpatterns.factory.simplefactory.simplefactory.pizza.Pizza;

/**
 * 简单工厂模式
 * <p>
 * 基本介绍:
 * 1) 简单工厂模式是属于创建型模式,是工厂模式的一种.简单工厂模式是由一个工厂对象决定创建出哪一种产
 * 品类的实例.简单工行藏模式就是工厂模式家族中最简单实用的模式.
 * 2) 简单工厂模式:定义了一个创建对象的类,由这个类来封装实例化对象的行为(代码).
 * 3) 在软件开发中,当我们会用到大量的创建某种,某类或者某批对象时,就会使用到工厂模式.
 */

//简单工厂模式也叫静态工厂模式,利用静态方法进行改进
public class SimpleFactory2 {
    //根据ordertype返回对应的Pizza对象
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 芝士披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }
}
