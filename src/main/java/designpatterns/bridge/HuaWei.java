package designpatterns.bridge;

public class HuaWei implements Brand{
    public void open(){
        System.out.println("华为手机开机");
    }

    public void close(){
        System.out.println("华为手机关机");
    }

    public void call(){
        System.out.println("华为手机打电话");
    }
}
