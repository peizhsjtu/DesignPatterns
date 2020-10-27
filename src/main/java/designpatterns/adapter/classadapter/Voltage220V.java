package designpatterns.adapter.classadapter;

//被适配的类
public class Voltage220V {
    //输出220V电压
    public int output220V(){
        int src = 220;
        System.out.println("电压为: "+ src+ "V");
        return src;
    }

}
