package designpatterns.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    public int output5V() {
        //获取220V电压
        int srcV = output220V();
        int desV = srcV / 44;
        return desV;
    }
}
