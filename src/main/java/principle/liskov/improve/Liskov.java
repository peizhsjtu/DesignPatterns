package principle.liskov.improve;

/**
 * 1)我们发现原来运行正常的相减功能发生了错误。原因就是类 B 无意中重写了父类的方法，造成原有功能出现错误。在实际编程中，
 * 我们常常会通过重写父类的方法完成新的功能，这样写起来虽然简单，但整个继承体系的
 *
 * 复用性会比较差。特别是运行多态比较频繁的时候
 *
 * 2)通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等关系代替.
 */
public class Liskov {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-----------------------");
        //因为B类不在继承A类，因此调用者不会再调用func1求减法
        //调用完成的功能就会很明确
        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1+8=" + b.func1(1, 8));
        System.out.println("11-3="+b.func3(11, 3));
    }
}

class Base {

}

// A 类
class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B 类继承了 A
// 增加了一个新功能：完成两个数相加,然后和 9 求和
class B extends Base {
    //如果B需要使用A类的方法，使用组合关系
    A a = new A();

    //这里重写了 A 类的方法, 可能是无意识
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
