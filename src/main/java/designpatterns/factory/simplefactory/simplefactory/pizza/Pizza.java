package designpatterns.factory.simplefactory.simplefactory.pizza;

/**
 * 具体需求:
 * 看一个披萨的项目：要便于披萨种类的扩展，要便于维护
 * 1)披萨的种类很多(比如 GreekPizz、CheesePizz 等)
 * 2)披萨的制作有 prepare，bake, cut, box
 * 3)完成披萨店订购功能。
 *
 * 传统方式的优缺点
 * 4)改进的思路分析
 * 分析: 修改代码可以接受，但是如果我们在其他的地方也有创建Pizza的代码,就意味着,也需要修改,而创建
 * Pizza的代码,往往也有多处
 * 思路:把创建Pizza对象封装到一个类中,这样我们有新的Pizza种类时,只需要修改该类即可,其他有创建到
 * Pizza对象的代码就不需要修改了
 * -->简单工厂模式
 */
public abstract class Pizza {
    protected String name;

    //准备材料,不同的披萨不一样,因此,我们做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking;");
    }

    public void cut(){
        System.out.println(name + " cuttint;");
    }

    public void box(){
        System.out.println(name + " boxing;");
    }

    public void setName(String name){
        this.name = name;
    }
}
