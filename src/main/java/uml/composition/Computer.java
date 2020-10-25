package uml.composition;

/**
 * 类图——组合关系
 *
 * 也是整体与部分的关系，但是整体与部分不可以分开
 *
 */
public class Computer {
    //当Computer实例创建后,Mouse和Monitor实例也同时创建，当他们销毁时，也同时销毁.
    //是一种共生的关系
    private Mouse mouse = new Mouse();//鼠标可以和computer不能分离
    private Monitor monitor = new Monitor();//显示器可以和computer不能分离

    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
}

class Mouse{}
class Monitor{}
