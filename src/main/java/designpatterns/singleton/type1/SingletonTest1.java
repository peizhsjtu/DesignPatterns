package designpatterns.singleton.type1;

/**
 * 单例模式介绍
 *
 * 所谓的单例设计模式,就是采取一定的方法保证在整个的软件系统中,对某个类只能存在一个对象实例,
 * 并且该类只提供一个取得其对象实例的方法.
 *
 * 单例模式注意事项和细节说明
 * 1) 单例模式保证了系统内存中该类只存在一个对象,节省了系统资源,对于一些需要频繁创建销毁的对
 * 象,使用单例模式可以提高系统性能.
 * 2) 当想实例化一个单例类的时候,必须要记住使用相应的获取对象的方法,而不是使用new;
 * 3) 单例模式使用的场景:需要频繁的进行创建和销毁的对象,创建爱你对象时消耗过多或耗费资源过多
 * (即:重量级对象),蛋又经常用到的对象,工具类对象,频繁访问数据库或文件的对象(比如数据源,
 * session工厂等)
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = "+instance1.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());
    }
}


/**
 * 饿汉式(静态变量)
 * 优缺点说明:
 * 1) 优点: 这种写法比较简单，就是在类装载的时候就完成实例化.避免了线程同步问题.
 * 2) 缺点: 在类装载的时候就完成实例化，没有达到Lazy Loading的效果.如果从始至终从未使用过这个
 * 实例，则会造成内存的浪费.
 * 3) 这种方式基于classloader机制避免了多线程的同步问题，不过instance在类装载时就实例化,在单
 * 例模式中大多数都是调用getInstance方法,但是导致类装载的原因有很多种,因此不能确定有其他的方式(
 * 或者其他的静态方法)导致类装载，这时候初始化instance就没有达到lazy loading的效果
 *
 * 4) 结论: 这种单例模式可用，可能造成内存浪费
 */
//饿汉式(静态变量)
class Singleton{

    //1. 构造器私有化,外部不能new
    private Singleton(){}

    //2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供一个共有的静态方法,返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
