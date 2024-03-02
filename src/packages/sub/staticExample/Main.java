package packages.sub.staticExample;

public class Main {
    public static void main(String[] args) {
        Human sd=new Human(21,"Souvik",5000,false);
        Human am=new Human(21,"Akash",5000,true);

        System.out.println(sd.population);//it will work using object name
        System.out.println(am.population);

//        but always recommanded using static variable via class name
        System.out.println(Human.population);
        fun();//only static method can be called inside a static method
    }
//    void fun(){} //not possible
    static void fun(){
        System.out.println("this is from fun");
//        message(); //depending on an object so either it have to be an object  or make it static

        //you cannot access non static stuff without referencing their instances
        //in a static context

        Main obj=new Main();
        obj.message();
    }
    void message(){
//        fun();
        System.out.println("this is from messsage");
    }
}
