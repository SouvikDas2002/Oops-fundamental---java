package packages.sub.four_piller.abstraction;

public class Daughter extends Parent{
    Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a Developer");
    }

    @Override
    void partner() {
        System.out.println("I love debugging");
    }
}
