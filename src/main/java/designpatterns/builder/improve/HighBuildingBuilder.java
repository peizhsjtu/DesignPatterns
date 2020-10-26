package designpatterns.builder.improve;


public class HighBuildingBuilder extends HouseBuilder{
    @Override
    public void buildBasic(){
        System.out.println("高楼地基20米");
        super.house.setBasic("建造高楼地基");
    }

    @Override
    public void buildWalls(){
        System.out.println("高楼墙20米");
        super.house.setWall("建造高楼的墙");
    }

    @Override
    public void roofed(){
        System.out.println("高楼透明屋顶");
        super.house.setRoof("建造高楼的天花板");
    }

    @Override
    public House buildHouse(){
        return house;
    }

}
