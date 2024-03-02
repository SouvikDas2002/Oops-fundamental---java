package packages.sub.four_piller.inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight

    Box(){
      this.h=-1;
      this.l=-1;
      this.w=-1;
    }

    Box(double side){
        w=side;
        l=side;
        h=side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h= old.h;
        this.w= old.w;
        this.l= old.l;
    }

    public void info(){
        System.out.println("Start");
    }
}
