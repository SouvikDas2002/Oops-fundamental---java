package packages.sub.four_piller.inheritance.single;

class MountainBike extends Bicycle{
    public int seat;

    public MountainBike(int gear, int speed, int seat) {
        super(gear, speed);
        this.seat = seat;
    }
    public String toString(){
        return ("Gear : "+super.gear+" Speed : "+super.speed+" seat : "+seat);
    }
}
