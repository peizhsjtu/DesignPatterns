package designpatterns.singleton.type5;

public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = "+instance1.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());
    }
}

/**
 * 懒汉式
 *
 * 优缺点说明:
 * 1)这种方式,本意是想对第四种实现方式的改进,因为前面同步方法效率太低,改为同步产生实例化的
 * 代码块
 * 2)但是这种同步并不能起到线程同步的作用,跟第三种实现方式遇到的情形一致,加入另一个线程进入
 * 了if(singleton == null)判断语句块,还未来得及往下执行,另一个秀按成也通过了这个判断语
 * 句,这时便会产生多个实例.
 * 3)结论:在实际开发中,不能使用这种方式
 *
 */
class Singleton{
    private Singleton(){}

    private static Singleton instance;

    //
    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
