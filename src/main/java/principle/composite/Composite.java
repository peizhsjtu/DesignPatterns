package principle.composite;

/**
 * 原则是尽量使用合成/聚合的方式，而不是使用继承
 */
public class Composite {
    public static void main(String[] args) {
        System.out.println();
    }
}
// 方式 1： 通过接口传递实现依赖
// 开关的接口


class A {
    public void method1(){}
    public void method2(){}
    public void method3(){}
}

//依赖关系，在方法参数传入A
class B{
    public void methodB(A a){}
}

//聚合关系，在域中定义A，并且通过set传入
class C{
    A a;
    public void setA(A a){
        this.a = a;
    }
}


//组合关系，直接在域中new A
class D{
    A a = new A();
}

