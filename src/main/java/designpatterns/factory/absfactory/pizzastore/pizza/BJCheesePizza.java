package designpatterns.factory.absfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    public void prepare(){
        setName("北京的芝士披萨");
        System.out.println(" 北京的芝士披萨 准备原材料");
    }
}
