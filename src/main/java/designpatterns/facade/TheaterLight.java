package designpatterns.facade;

public class TheaterLight {
    private TheaterLight(){}

    private static class GenerateInstance{
        private static final TheaterLight instance = new TheaterLight();
    }

    public static TheaterLight getInstance(){
        return GenerateInstance.instance;
    }

    public void dim(){
        System.out.println("Light is dim...");
    }

    public void bright(){
        System.out.println("Light is bright...");
    }
}
