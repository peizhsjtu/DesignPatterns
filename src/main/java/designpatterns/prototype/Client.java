package designpatterns.prototype;

/**
 * 传统模式的缺点:
 * 1)在创建新的对象时，总是需要重新获取原始对象的属性,如果创建的对象比较复杂时,效率较低;
 * 2)总是需要重新初始化对象,而不是动态的获得对象运行时的状态,不够灵活;
 * 3)改进的思路分析:
 * 思路：Java 中 Object 类是所有类的根类，Object 类提供了一个 clone()方法，该方法
 * 可以将一个 Java 对象复制一份，但是需要实现 clone 的 Java 类必须要实现一个接口
 * Cloneable，该接口表示该类能够复制且具有复制的能力  =>原型模式
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "red");
    }
}
