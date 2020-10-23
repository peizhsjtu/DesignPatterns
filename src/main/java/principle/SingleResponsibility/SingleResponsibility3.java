package principle.SingleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}

/**
 * 方式3的分析
 * 1.这种修改方法没有对原来类作大的修改，只是增加方法
 * 2. 这里虽然没有在类这个级别上准守单一原则，但是在方法级别是遵守的；
 */
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上跑");
    }


    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水里跑");
    }


    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空中飞");
    }
}