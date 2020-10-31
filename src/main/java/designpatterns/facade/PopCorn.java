package designpatterns.facade;

public class PopCorn {
    private PopCorn(){}

    private static class GenerateInstance{
        private static final PopCorn instance = new PopCorn();
    }

    public static PopCorn getInstance(){
        return GenerateInstance.instance;
    }

    public void on(){
        System.out.println("Popocrn is on...");
        System.out.println("爆米花机正在出爆米花");
    }

    public void off(){
        System.out.println("Popcorn is off...");
    }
}
