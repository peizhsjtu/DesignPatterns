package designpatterns.factory.factorymethod.pizzastore;

import designpatterns.factory.factorymethod.pizzastore.order.BJOrderPizza;

import java.io.IOException;

/**
 * 需求: 披萨项目新的需求:客户在点披萨时,可以点不同口味的披萨,比如北京的cheese披萨,
 * 北京的pepper披萨或者伦敦的cheese披萨,伦敦的pepper披萨.
 *
 * 工厂方法模式介绍
 * 工厂方法模式设计方案:将披萨项目的实例化功能抽象成抽象方法,在不同的口味点餐子类中具体实现.
 *
 * 工厂方法模式:定义了一个创建对象的抽象方法,由子类决定要实例化的类.工厂方法模式将对象的实例
 * 化推迟到子类.
 */
public class Pizzastore {
    public static void main(String[] args) throws IOException {
        new BJOrderPizza();
    }
}
