package uml;

/**
 * 在程序中定义实体：Person与IDCard,Head,那么Head和Person就是组合,IDCard和Person就是聚合
 *
 * 但是如果在程序中Person实体中定义了对IDCard进行级联删除，即删除Person时连同IDCard一起删除，
 * 那么IDCard与Person就是组合了.
 */
public class Person {
    private IDCard card;//聚合关系
    private Head head = new Head();//组合关系
}

class Head{}
class IDCard{}