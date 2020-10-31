package designpatterns.facade;

public class DVDPlayer {
    private DVDPlayer(){}

    private static class GenerateDVDPlayer{
        private static final DVDPlayer instance = new DVDPlayer();
    }

    public static DVDPlayer getInstance(){
        return GenerateDVDPlayer.instance;
    }

    public void on(){
        System.out.println("DVDPlayer is on...");
    }

    public void off(){
        System.out.println("DVDPlayer is off...");
    }

    public void pause(){
        System.out.println("DVDPlayer pause...");
    }
}
