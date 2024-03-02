package packages.sub.four_piller.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(BoxWeight other){
        super(other);
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //call the parent class constructor and refers directly above class
//        Box is class above Boxweight class
        this.weight = weight; //this refers to inside Boxweight weight
//        System.out.println(super.weight); //this refers to parent weight
    }

}
