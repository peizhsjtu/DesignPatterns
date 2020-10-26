package designpatterns.builder;

public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic(){
        System.out.println("建造普通票房子地基");
    }

    @Override
    public void buildWalls(){
        System.out.println("建造普通房子的墙");
    }

    @Override
    public void roofed(){
        System.out.println("建造普通房子的天花板");
    }
}
