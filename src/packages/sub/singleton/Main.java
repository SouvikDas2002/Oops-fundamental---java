package packages.sub.singleton;

public class Main {
    public static void main(String[] args) {
        //all the instances pointing to same obj
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
    }
}
