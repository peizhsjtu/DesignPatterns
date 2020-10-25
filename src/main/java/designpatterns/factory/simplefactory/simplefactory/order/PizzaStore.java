package designpatterns.factory.simplefactory.simplefactory.order;

//相当于一个客户端,相当于订购
public class PizzaStore {

    public static void main(String[] args){
        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());

        //使用静态简单工厂模式
        new OrderPizza2();

    }
}
