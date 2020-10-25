package uml.aggregation;


/**
 * 类图——聚合关系
 *
 * 聚合关系表示的是整体和部分的关系，整体与部分可以分开。聚合关系是关联关系的特例，所以它具有关联的
 * 导航性与多重性.
 *
 * 如：一台电脑由键盘,显示器,鼠标等组成；组成电脑的各个配件是可以从电脑上分离出来的，使用带空心菱形
 * 的实线来表示.
 */
public class Computer {
    private Mouse mouse;//鼠标可以和computer分离
    private Monitor monitor;//显示器可以和computer分离

    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
}

class Mouse{}
class Monitor{}
