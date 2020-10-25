package uml.dependency;

/**
 * 类图——依赖关系
 * 只要是在类中用到了对方，那么他们之间就存在依赖关系。如果没有对方，连编译都通过不了
 *
 * 小结：
 * 1)类中用到了对方
 * 2)如果是类的成员属性
 * 3)如果是方法的返回类型
 * 4)是方接收的参数类型
 * 5)方法中使用到
 */
public class Dependence {
    private PersonDao personDao;

    public void save(Person person){}

    public IDCard getIDCard(Integer personId){
        return new IDCard();
    }

    //违反了迪米特法则
    public void modify(){
        Department department = new Department();
    }

}

class PersonDao{}
class IDCard{}
class Person{}
class Department{}

