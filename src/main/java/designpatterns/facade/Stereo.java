package designpatterns.facade;

public class Stereo {
    private Stereo(){}

    private static class GenerateInstance{
        private static final Stereo instance = new Stereo();
    }

    public static Stereo getInstance(){
        return GenerateInstance.instance;
    }

    public void on(){
        System.out.println("Stereo is on...");
    }

    public void off(){
        System.out.println("Stereo is off...");
    }
}
