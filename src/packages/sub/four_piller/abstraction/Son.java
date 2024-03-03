package packages.sub.four_piller.abstraction;

public class Son extends Parent{
    Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Chitkara");
    }
}
