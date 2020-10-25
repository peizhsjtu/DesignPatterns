package designpatterns.prototype.deepclone;

import java.io.*;


/**
 * 深拷贝基本介绍:
 * 1) 复制对象的所有基本数据类型的成员变量值
 * 2) 为所有引用数据类型的成员变量申请存储空间,并复制每个引用数据类型成员变量所引用的
 * 对象,直到该对象可达的所有对象.也就是说,对象就行深拷贝要对这个对象进行拷贝.
 * 3) 深拷贝实现方式1:重写clone方法来实现深拷贝
 * 4) 深拷贝实现方式2:通过对象序列化实现深拷贝
 *
 * 原型模式的注意事项和细节:
 * 1) 创建新的对象比较复杂时,可以利用原型模式简化对象的创建过程,同时也能够提高效率;
 * 2) 不用重新初始化对象,而是动态地获得对象运行时的状态;
 * 3) 如果原始对象发生变化(增加或减少属性),其他克隆的对象也会发生相应的变化,无需修改
 * 代码;
 * 4) 在实现深克隆的时候可能需要比较复杂的代码;
 * 5) 缺点:需要为每一个类配备一个克隆方法,这对全新的类来说不是很难,但对已有的类进行
 * 改造时,需要修改其源代码,违背了ocp原则;
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "松江";
        deepProtoType.deepCloneTarget = new DeepCloneTarget("某公司","三资公司");

        //方式1完成深拷贝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.clone();
        System.out.println("deepProtoType hashCode: "+deepProtoType.deepCloneTarget.hashCode());
        System.out.println("deepProtoType2 hashCode: "+deepProtoType2.deepCloneTarget.hashCode());
        System.out.println("deepProtoType3 hashCode: "+deepProtoType3.deepCloneTarget.hashCode());

        System.out.println("========================");
        //方式2完成深拷贝

        DeepProtoType deepProtoType4 = (DeepProtoType) deepProtoType.deepClone();
        DeepProtoType deepProtoType5 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println("deepProtoType hashCode: "+deepProtoType.deepCloneTarget.hashCode());
        System.out.println("deepProtoType4 hashCode: "+deepProtoType4.deepCloneTarget.hashCode());
        System.out.println("deepProtoType5 hashCode: "+deepProtoType5.deepCloneTarget.hashCode());

    }

}
