package designpatterns.adapter.objectadapter;


/**
 * ================对象适配器模式================
 * 介绍
 * 1) 基本思路和类的适配器模式相同,只是将Adapter类作修改,不是继承src类,而是持有
 * src类的实例,以解决兼容性的问题,即:持有src类,实现dst类接口.
 * 2) 根据"合成复用原则",在系统中尽量使用关联关系来替代继承关系.
 * 3) 对象适配器模式是适配器模式常用的一种.
 * ===========================================
 * 注意事项和细节
 * 1) 对象适配器和累适配器其实算是同一种思想,只不过实现方式不同.根据合成复用原则,
 * 使用组合替代继承,所以它解决了类适配器必须继承src的局限性问题,也不再要求dst必
 * 须是接口.
 * 2) 使用成本更低,更灵活
 */
public class VoltageAdapter implements IVoltage5V {
    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    public int output5V(){
        int dst = 0;
        if(voltage220V != null){
            int src = voltage220V.output220V();
            dst = src/44;
            System.out.println("使用对象适配器进行适配");
        }
        return dst;
    }
}
