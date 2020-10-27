package designpatterns.adapter.objectadapter;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("============对象适配器模式============");
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        phone.charging(new VoltageAdapter(voltage220V));
    }
}
