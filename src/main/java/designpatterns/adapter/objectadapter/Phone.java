package designpatterns.adapter.objectadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压等于5V,可以充电");
        }else{
            System.out.println("电压不等于5V,无法充电");
        }
    }
}
