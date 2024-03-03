package packages.sub.four_piller.inheritance.multiple;

public class Main {
    public static void main(String[] args) {
//        Car c1=new Car();
//
//        c1.acc();
//        c1.brake();
//        c1.start();
//        c1.stop();

        NiceCar car=new NiceCar();

        car.start();
        car.MusicOn();

        car.upgradeEngine();
        car.start();
        car.MusicOn();

        car.stop();
    }
}
