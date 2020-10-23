package principle.inversion.improve;

/**
 * 依赖倒转原则(Dependence Inversion Principle)是指：
 * 1)高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 2)抽象不应该依赖细节，细节应该依赖抽象
 * 3)依赖倒转(倒置)的中心思想是面向接口编程
 *
 * 4)依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在 java 中，抽象指的是接口或抽象类，细节就是具体的实现类
 *
 * 5)使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成
 */
public class DependencyInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.reveive(new Email());

        person.reveive(new Weixin());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "邮件信息: hello,world";
    }
}

class Weixin implements  IReceiver{
    public String getInfo(){
        return "微信信息: hahahhah";
    }
}

class Person{
    //这里是对接口的依赖
    public void reveive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}


/**
 * 2.5.3依赖关系传递的三种方式和应用案例
 *
 * 1)接口传递
 * 应用案例代码
 *
 * 2)构造方法传递应用案例代码
 *
 * 3)setter 方式传递
 */


/*
public class DependencyPass {

    public static void main(String[] args) {
// TODO Auto-generated method stub ChangHong changHong = new ChangHong();
//	OpenAndClose openAndClose = new OpenAndClose();
//	openAndClose.open(changHong);

//通过构造器进行依赖传递
//	OpenAndClose openAndClose = new OpenAndClose(changHong);
//	openAndClose.open();
//通过 setter 方法进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose(); openAndClose.setTv(changHong); openAndClose.open();

    }

}

// 方式 1： 通过接口传递实现依赖
// 开关的接口


// interface IOpenAndClose {
// public void open(ITV tv); //抽象方法,接收接口
// }
//
// interface ITV { //ITV 接口
// public void play();
// }
//
// class ChangHong implements ITV {
//
//	@Override
//	public void play() {
//	// TODO Auto-generated method stub
//	System.out.println("长虹电视机，打开");
//	}
//
// }
//// 实现接口
// class OpenAndClose implements IOpenAndClose{
// public void open(ITV tv){
// tv.play();
// }
// }

// 方式 2: 通过构造方法依赖传递
// interface IOpenAndClose {


// public void open(); //抽象方法
// }
// interface ITV { //ITV 接口
// public void play();
// }
// class OpenAndClose implements IOpenAndClose{
// public ITV tv; //成员
// public OpenAndClose(ITV tv){ //构造器
// this.tv = tv;
// }
// public void open(){
// this.tv.play();
// }
// }



// 方式 3 ,  通过 setter 方法传递
interface IOpenAndClose {
    public void open(); // 抽象方法


    public void setTv(ITV tv);
}

interface ITV { // ITV 接口
    public void play();
}




class OpenAndClose implements IOpenAndClose { private ITV tv;

    public void setTv(ITV tv) { this.tv = tv;
    }


    public void open() { this.tv.play();
    }
}


class ChangHong implements ITV {


    @Override
    public void play() {
// TODO Auto-generated method stub
        System.out.println("长虹电视机，打开");
    }


}*/
