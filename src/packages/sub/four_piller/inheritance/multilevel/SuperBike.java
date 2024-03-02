package packages.sub.four_piller.inheritance.multilevel;

public class SuperBike extends MountainBike{

    public int hp;

    public SuperBike(int gear, int speed, int seat, int hp) {
        super(gear, speed, seat);
        this.hp = hp;
    }

    public String toString(){
        return ("Gear : "+super.gear+" Speed : "+super.speed+" seat : "+seat+" horse power: "+ hp+"cc");
    }
}
