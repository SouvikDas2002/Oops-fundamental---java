package packages.sub.four_piller.inheritance.multilevel;

public class Bicycle {
    int gear;
    int speed;
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBrake(int dec){
        speed-=dec;
    }
    public void speedUp(int inc){
        speed+=inc;
    }
}
