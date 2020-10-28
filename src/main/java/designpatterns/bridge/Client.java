package designpatterns.bridge;

/**
 * =================桥接模式基本介绍===============
 * 1) 桥接模式(Bridge模式)是指:将实现与抽象放在两个不同的
 * 类层次中,使两个层次可以独立改变
 *
 * 2) 是一种结构型设计模式
 *
 * 3) Bridge模式基于类的最小设计原则,通过使用聚合,封装,继承
 * 等行为让不同的类承担不同的职责.他的主要特点是把抽象(
 * Abstraction)与行为实现(Implementation)分离开来,从而
 * 可以保持各部分的独立性以及应对他们的功能扩展.
 * =============================================
 * 原理类图说明:
 * 1) Client类:桥接模式的调用者
 * 2) 抽象类(Abstraction):维护了Implementor/即它的实现类
 * ConcreteImplementorA...二者是聚合关系,Abstraction充当
 * 桥接类
 * 3) RefinedAbstraction:是Abstraction抽象类的子类
 * 4) Implementor:行为实现类的接口
 * 5) ConcreteImplementorA/B:行为的具体实现类
 * 6) 从UML图看出,这里的抽象类和接口是聚合的关系,其实是调用者
 * 和被调用的关系.
 * ===============================================
 * 桥接模式的注意事项和细节:
 * 1) 实现了抽象和实现部分的分析,从而极大的提供了系统的灵活性,
 * 让抽象部分和实现部分独立开来,这有助于系统进行分层设计,从而
 * 产生更好的结构化系统.
 * 2) 对于系统的高层部分,只需要知道抽象部分和实现部分的接口就行
 * 了,其他的部分由具体业务来完成.
 * 3) 桥接模式替代多层继承方案,可以减少子类的个数,降低系统管理
 * 和维护成本.
 * 4) 桥接模式的引入增加了系统的理解和设计难度,由于聚合关联关系
 * 建立在抽象层,要求开发者针对抽象进行设计和编程.
 * 5) 桥接模式要去正确识别出系统中两个独立变化的维度,因此其使用范
 * 围有一定的局限性,即需要有这样的应用场景.
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("===========================");
        Phone phone2 = new UpRightPhone(new HuaWei());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
