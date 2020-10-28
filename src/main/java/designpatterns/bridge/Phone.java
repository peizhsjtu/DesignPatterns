package designpatterns.bridge;

public abstract class Phone {
    //组合品牌
    Brand brand;
    public Phone(Brand brand){
        this.brand = brand;
    }

    public void open(){
        this.brand.open();
    }

    public void close(){
        this.brand.close();
    }

    public void call(){
        this.brand.call();
    }
}
