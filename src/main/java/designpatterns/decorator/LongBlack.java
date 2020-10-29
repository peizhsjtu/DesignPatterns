package designpatterns.decorator;

public class LongBlack extends Coffee{
    public LongBlack(){
        super.setPrice(10.0f);
        super.setDescription("黑咖啡");
    }
}
