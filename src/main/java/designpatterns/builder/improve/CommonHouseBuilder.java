package designpatterns.builder.improve;

/**
 * 相当于ConcreteBuilder
 */
public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic(){
        System.out.println("普通房子地基1米");
        super.house.setBasic("建造普通票房子地基");
    }

    @Override
    public void buildWalls(){
        System.out.println("普通房子墙10米");
        super.house.setWall("建造普通房子的墙");
    }

    @Override
    public void roofed(){
        System.out.println("普通房子天花板");
        super.house.setRoof("建造普通房子的天花板");
    }

    @Override
    public House buildHouse(){
        return house;
    }

}
