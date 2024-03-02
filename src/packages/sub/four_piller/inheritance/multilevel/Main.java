package packages.sub.four_piller.inheritance.multilevel;

public class Main {
    public static void main(String[] args) {
        MountainBike mb=new MountainBike(2,4,4);
        System.out.println(mb.toString());

        SuperBike sb=new SuperBike(2,4,2,450);
        System.out.println(sb.toString());
    }
}
