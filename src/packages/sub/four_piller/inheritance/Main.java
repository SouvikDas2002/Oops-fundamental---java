package packages.sub.four_piller.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4.6,5.5,6.4);
////        Box box2=new Box(box);
        System.out.println(box.l+" "+ box.h+" "+ box.w);

//        BoxWeight box3=new BoxWeight();
//        BoxWeight box4=new BoxWeight(2,4,6,1);
//        System.out.println(box3.h+""+box3.weight);
//        System.out.println(box4.h+" "+box4.weight+" "+ box4.w+" "+box4.l);


        Box box5=new BoxWeight(2,3,4,5);

//        BoxWeight box6=new Box(2,3,4); //error

        BoxPrice bp=new BoxPrice(5,8,200);

    }
}
