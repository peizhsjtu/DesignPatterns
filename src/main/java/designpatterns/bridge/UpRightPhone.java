package designpatterns.bridge;

//直立式手机 继承抽象类Phone
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand){
        super(brand);
    }

    public void open(){
        System.out.println("直立式手机开机");
        super.brand.open();
    }

    public void close(){
        System.out.println("直立式手机关机");
        super.brand.close();
    }

    public void call(){
        System.out.println("直立式手机打电话");
        super.brand.call();
    }
}
