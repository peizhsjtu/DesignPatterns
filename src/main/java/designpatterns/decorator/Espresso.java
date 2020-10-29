package designpatterns.decorator;

//具体的咖啡
public class Espresso extends Coffee{
    public Espresso(){
        super.setPrice(5.0f);
        super.setDescription("意大利咖啡");
    }
}
