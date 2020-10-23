package principle.segregation;

/**
 * 接口隔离原则：
 * 1)客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 * 3)类 A 通过接口 Interface1 依赖类 B，类 C 通过接口 Interface1 依赖类 D，如果接口 Interface1 对于类 A 和类 C
 * 来说不是最小接口，那么类 B 和类 D 必须去实现他们不需要的方法。
 * 4)按隔离原则应当这样处理：
 * 将接口 Interface1 拆分为独立的几个接口(这里我们拆分成 3 个接口)，类 A 和类 C 分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{
    public void operation1() {
        System.out.println("B 实现了operation1");
    }
    public void operation2(){
        System.out.println("B 实现了operation2");
    }

    public void operation3(){
        System.out.println("B 实现了operation3");
    }

    public void operation4(){
        System.out.println("B 实现了operation4");
    }

    public void operation5(){
        System.out.println("B 实现了operation5");
    }
}



class D implements Interface1{
    public void operation1() {
        System.out.println("B 实现了operation1");
    }
    public void operation2(){
        System.out.println("B 实现了operation2");
    }

    public void operation3(){
        System.out.println("B 实现了operation3");
    }

    public void operation4(){
        System.out.println("B 实现了operation4");
    }

    public void operation5(){
        System.out.println("B 实现了operation5");
    }
}

/**
 * A类通过接口Interface1 依赖(使用)B类，但是只会用到1,2,3方法
 */
class A{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }

    public void depend3(Interface1 i){
        i.operation3();
    }
}

/**
 * C类通过借口Interface1依赖(使用)D类，但是只会用到1,4,5方法
 */
class C{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }

    public void depend5(Interface1 i){
        i.operation5();
    }
}