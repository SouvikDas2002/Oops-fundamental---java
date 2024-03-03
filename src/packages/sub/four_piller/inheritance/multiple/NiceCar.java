package packages.sub.four_piller.inheritance.multiple;

public class NiceCar {
    private Engine engine;
    private Media player=new CDPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
       engine.start();
    }
    public void stop(){
       engine.stop();
    }
    public void acc(){
       engine.acc();
    }
    public void MusicOn(){
       player.start();
    }
    public void MusicOff(){
       player.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngines();
    }
}
