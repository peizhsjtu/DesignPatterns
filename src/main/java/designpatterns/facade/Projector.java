package designpatterns.facade;

public class Projector {
    private Projector(){}

    private static class GenerateInstance{
        private static final Projector instance = new Projector();
    }

    public static Projector getInstance(){
        return GenerateInstance.instance;
    }

    public void play(){
        System.out.println("Project is playing...");
    }

    public void off(){
        System.out.println("Project is off...");
    }
}
