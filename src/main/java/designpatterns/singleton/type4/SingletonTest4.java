package designpatterns.singleton.type4;

public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = "+instance1.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());
    }
}

/**
 * 懒汉式(线程安全,同步方法)
 *
 * 优缺点说明:
 * 1)解决了线程不安全的问题
 * 2)效率太低了,每个线程在想获得类的实例时候,执行getInstance()方法都要进行同步.而
 * 其实这个方法只执行一次实例化代码就够了,后面的想获得该类实例,直接return就行了.方法
 * 进行同步效率太低.
 *
 * 3)在实际开发中,不推荐使用这种方式
 */
class Singleton{
    private Singleton(){}

    private static Singleton instance;

    //加入同步代码块,解决线程不安全问题
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
