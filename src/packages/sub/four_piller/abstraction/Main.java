package packages.sub.four_piller.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(21);
        son.career();

        Daughter d=new Daughter(16);
        d.career();

//        Parent mom=new Parent(); cant be create a object of parent class 
    }
}
