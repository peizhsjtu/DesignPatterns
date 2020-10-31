package designpatterns.facade;

public class Screen {
    private Screen(){}

    private static class GenerateInstance{
        private static final Screen instance = new Screen();
    }

    public static Screen getInstance(){
        return GenerateInstance.instance;
    }

    public void down(){
        System.out.println("Screen is down...");
    }

    public void up(){
        System.out.println("Screen is off...");
    }
}
