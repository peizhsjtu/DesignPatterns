package designpatterns.decorator;


public class Decorator extends Drink{
    //被装饰者
    Drink obj;
    public Decorator(Drink drink){
        //组合
        this.obj = drink;
    }

    public float cost(){
        //自己价格
        return super.getPrice() + obj.cost();
    }

    public String getDescription(){
        //输出装饰着信息
        return super.getDescription() + "  &&  "+obj.getDescription();
    }
}
