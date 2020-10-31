package designpatterns.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private PopCorn popCorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade(){
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.projector = Projector.getInstance();
        this.theaterLight = TheaterLight.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready(){
        this.popCorn.on();
        this.screen.down();
        this.projector.play();
        this.theaterLight.dim();
        this.stereo.on();
    }

    public void play(){
        this.dvdPlayer.on();
    }

    public void pause(){
        this.dvdPlayer.pause();
        this.theaterLight.bright();
    }

    public void continuePlaying(){
        this.dvdPlayer.on();
        this.theaterLight.dim();
    }

    public void end(){
        this.theaterLight.bright();
        this.popCorn.off();
        this.dvdPlayer.off();
        this.stereo.off();
        this.screen.up();
        this.projector.off();
    }
}
