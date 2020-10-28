package designpatterns.bridge;


//折叠式手机,继承抽象类Phone
public class FoldedPhone extends  Phone{
    public FoldedPhone(Brand brand){
        super(brand);
    }

    public void open(){
        System.out.println("折叠手机开机");
        super.brand.open();
    }

    public void close(){
        System.out.println("折叠手机关机");
        super.brand.close();
    }

    public void call(){
        System.out.println("折叠手机打电话");
        super.brand.call();
    }
}
