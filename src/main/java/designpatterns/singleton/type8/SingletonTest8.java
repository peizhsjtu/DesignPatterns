package designpatterns.singleton.type8;

public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOk();
    }
}

/**
 * 枚举
 *
 * 优缺点说明:
 * 1) 这借助了JDK1.5中添加的枚举来实现单例模式.不仅能耐避免多线程同步问题,而且还能防止
 * 反序列化重新创建新的对象.
 * 2) 这种方式是Effective Java作者Josh Bloch提倡的方式
 * 3) 结论:推荐使用
 */

//枚举里面都是常量
//使用枚举,可以实现单例
enum Singleton{
    INSTANCE;//属性

    public void sayOk(){
        System.out.println("ok~");
    }
}