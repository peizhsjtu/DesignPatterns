package designpatterns.decorator;

/**
 * 11.1星巴克咖啡订单项目（咖啡馆）：
 *
 * 1)咖啡种类/单品咖啡：Espresso(意大利浓咖啡)、ShortBlack、LongBlack(美式咖啡)
 * 、Decaf(无因咖啡)
 * 2)调料：Milk、Soy(豆浆)、Chocolate
 * 3)要求在扩展新的咖啡种类时，具有良好的扩展性、改动方便、维护方便
 * 4)使用 OO 的来计算不同种类咖啡的费用:  客户可以点单品咖啡，也可以单品咖啡+调料组合。
 * =============================================
 * 11.6装饰者模式定义
 * 1)装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，
 * 装饰者模式也体现了开闭原则(ocp)
 * 2)这里提到的动态的将新功能附加到对象和 ocp 原则，在后面的应用实例上会以代码的
 * 形式体现，请同学们注意体会。
 * 11.7装饰者模式原理
 * 1)装饰者模式就像打包一个快递
 * 主体：比如：陶瓷、衣服 (Component) //  被装饰者
 * 包装：比如：报纸填充、塑料泡沫、纸板、木板(Decorator)
 * 2)Component 主体：比如类似前面的 Drink
 * 3)ConcreteComponent 和 Decorator
 * ConcreteComponent：具体的主体， 比如前面的各个单品咖啡
 * 4)Decorator: 装饰者，比如各调料.
 * 在如图的 Component 与 ConcreteComponent 之间，如果 ConcreteComponent 类很多,
 * 还可以设计一个缓冲层，将共有的部分提取出来，抽象层一个类。
 */
public class Client {
    public static void main(String[] args) {
        Drink order = new Espresso();
        System.out.println(order.getDescription());
        System.out.println(order.cost());

        System.out.println("========================");

        order = new Milk(order);
        System.out.println(order.getDescription());
        System.out.println(order.cost());

        System.out.println("========================");

        order = new Milk(order);
        System.out.println(order.getDescription());
        System.out.println(order.cost());
    }
}
