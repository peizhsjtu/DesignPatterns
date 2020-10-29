package designpatterns.decorator;

public class Coffee extends Drink{

    public float cost(){
        return super.getPrice();
    }

}
