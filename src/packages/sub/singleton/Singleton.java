package packages.sub.singleton;

//The Singleton pattern is commonly used in situations where a single instance of a class needs to coordinate
// actions across the system, such as in a logging or configuration system.

//Implementing a Singleton Class in Java
//Declare a private static variable to hold the single instance of the class.
//Make the constructor of the class private, so that no other instances can be created.
//Provide a public static method to return the single instance of the class, creating it if necessary.

public class Singleton {
    private Singleton(){
        System.out.println("I am first"+this);
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}
