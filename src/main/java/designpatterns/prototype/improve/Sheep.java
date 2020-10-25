package designpatterns.prototype.improve;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    public Sheep friend;

    public Sheep(String name, int age, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException{
        Sheep sheep = null;
        try{
            sheep = (Sheep) super.clone();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}