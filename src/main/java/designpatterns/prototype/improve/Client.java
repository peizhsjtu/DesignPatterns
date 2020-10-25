package designpatterns.prototype.improve;

/**
 * 浅拷贝的介绍:
 * 1) 对于数据类型是基本数据类型的成员变量,浅拷贝会直接进行值传递,也就是将该
 * 属性值复制一份给新的对象;
 * 2) 对于数据类型是引用数据类型的成员变量,比如说成员变量是某个数组,某个类的
 * 对象等,那么浅拷贝会进行引用传递,也就是只是将该成员变量的引用值(内存地址)
 * 复制一份给新的对象.因为实际上两个对象的该成员变量都指向同一个实例.在这种情况下,
 * 在一个对象中修改该成员变量会影响到另一个对象的该成员变量值.
 * 3) 前面我们克隆羊就是浅拷贝
 * 4) 浅拷贝是使用默认的clone()方法来实现
 * sheep = (Sheep)super.clone();
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Tom", 1, "白色");
        sheep.friend = new Sheep("灰太狼",2,"灰色");

        System.out.println("原型模式完成对象的创建");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();

        System.out.println("sheep = "+sheep.toString()+",sheep.friend= "+sheep.friend.hashCode());
        System.out.println("sheep2 = "+sheep2.toString()+",sheep2.friend= "+sheep2.friend.hashCode());
        System.out.println("sheep3 = "+sheep3.toString()+",sheep3.friend= "+sheep3.friend.hashCode());
        System.out.println("sheep4 = "+sheep4.toString()+",sheep4.friend= "+sheep4.friend.hashCode());
        System.out.println("sheep5 = "+sheep5.toString()+",sheep5.friend= "+sheep5.friend.hashCode());

        System.out.println("===============================");
        System.out.println(sheep.friend == sheep2.friend);
    }
}
