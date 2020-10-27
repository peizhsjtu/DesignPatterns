package designpatterns.adapter.interfaceadapter;

/**
 *1)适配器模式(Default Adapter Pattern)或缺省适配器模式
 * 2)当不需要全部实现接口提供的方法时,可先设计一个抽象实现接口,
 * 并为该接口中每一个方法提供一个默认实现(空方法),那么该抽象类
 * 的子类可以有选择的覆盖弗雷的某些方法来实现需求
 * 3)适用于一个接口不想使用所有的方法的情况.
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {

            //只需覆盖我们使用的接口方法
            @Override
            public void m1() {
                System.out.println("实现m1方法");
            }
        };

        absAdapter.m1();

    }

}
