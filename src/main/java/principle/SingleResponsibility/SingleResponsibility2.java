package principle.SingleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 方案2的分析
 * 1. 遵守单一职责原则
 * 2. 但是这样做的开销很大，需要将类分解，同时修改客户端.
 * 3. 改进：直接修改Vehicle类，这样改动代码比较少
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在天空中运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在水中运行");
    }
}
