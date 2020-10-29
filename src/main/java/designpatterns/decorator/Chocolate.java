package designpatterns.decorator;

//调味品
public class Chocolate extends Decorator{
    public Chocolate(Drink obj){
        super(obj);
        setDescription("巧克力");
        setPrice(1.0f);

    }
}
