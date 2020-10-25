package designpatterns.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{
    public void prepare(){
        super.setName("伦敦的芝士披萨");
        System.out.println(" 伦敦的胡椒披萨 准备原材料 ");
    }
}
