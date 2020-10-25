package designpatterns.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    public void prepare(){
        super.setName(" 伦敦的胡椒披萨 ");
        System.out.println("伦敦的胡椒披萨 准备原材料");
    }
}
