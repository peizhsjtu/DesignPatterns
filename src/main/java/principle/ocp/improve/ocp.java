package principle.ocp.improve;

/**
 * 思路：把创建 Shape 类做成抽象类，并提供一个抽象的 draw 方法，让子类去实现即可，这样我们有新的图形种类时，
 * 只需要让新的图形类继承 Shape，并实现 draw 方法即可，使用方的代码就不需要修  ->	满足了开闭原则
 */
public class ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

//基类
abstract class Shape{
    int  m_type;
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape{
    Rectangle(){
        m_type = 1;
    }

    public void draw(){
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape{
    Circle(){
        m_type = 2;
    }

    public void draw(){
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle extends Shape{
    Triangle(){
        m_type = 3;
    }

    public void draw(){
        System.out.println(" 绘制三角形 ");
    }
}

class OtherGraphic extends Shape{
    OtherGraphic(){
        super.m_type = 4;
    }
    public void draw(){
        System.out.println(" 绘制其他图形 ");
    }
}

