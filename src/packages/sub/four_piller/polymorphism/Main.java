package packages.sub.four_piller.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes s=new Circle();
//        s.draw();
        Shapes s1=new Square();  //instance was creating of Shapes class but method will be call of Square class
        s1.draw();  //override the draw method of shapes class
    }
}
