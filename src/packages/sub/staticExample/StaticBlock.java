package packages.sub.staticExample;

public class StaticBlock {
    static int a=4;
    static int b;

    static{  //will only runs once when the first obj is create
        System.out.println("I am a static block");
        b=a*5;
    }
    public static void main(String[] args){
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
