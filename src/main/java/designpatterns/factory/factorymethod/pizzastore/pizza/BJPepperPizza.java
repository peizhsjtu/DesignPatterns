package designpatterns.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza{
    public void prepare(){
        super.setName("北京的胡椒披萨");
        System.out.println(" 北京的胡椒披萨  准备原材料");
    }
}
