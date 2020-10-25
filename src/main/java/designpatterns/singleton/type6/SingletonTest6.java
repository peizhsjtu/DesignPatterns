package designpatterns.singleton.type6;

public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = "+instance1.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());
    }

}

/**
 * double-check
 */
class Singleton{
    private Singleton(){}

    private volatile static Singleton instance;

    //提供一个静态的公有方法,加入双重检查代码,解决线程安全问题,同时解决懒加载问题.
    //同时保证了效率,推荐使用
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}