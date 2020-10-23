package principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.reveive(new Email());

    }
}

class Email{
    public String getInfo(){
        return "邮件信息: hello,world";
    }
}

/**
 * //完成Person接收消息的功能
 * //方式1分析
 * //1.简单，比较容易想到
 * //2. 如果我们获取的对象是 微信，短信等，则需要新增类，同事Person也要增加相应的方法
 *  3. 解决思路:引入一个抽象的接口IReceiver，表示接收者，这样Person类与借口IReceiver发生依赖
 *  因为Email，Weixin等都属于接收的范围，他们各自实现IRecever接口就ok，这样我们就符合依赖倒转原则.
 */
class Person{
    public void reveive(Email email){
        System.out.println(email.getInfo());
    }
}