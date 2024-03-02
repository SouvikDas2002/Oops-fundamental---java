package packages.sub.introduction;

public class Wrapper {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        Integer x=45; //wrapper
        Integer y=35;

        swap(a,b);
        swap(x,y);
        System.out.println(a+" "+b);
        System.out.println(x+" "+y);

//        final int c=2;
//        c=3; final variable cant be modified

        final A q=new A("Sd");
        q.name="AM"; //i can do that with non primitive object value in final
        System.out.println(q.name);
//        q=new packages.sub.introduction.A("tom"); this is not possible as object reference is set to final

        A obj;
        for(int i=0;i<100000000;i++){
            obj=new A("Random ones");
        }
    }
   static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}
class A{
    final int num=10;
    String name;
    A(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed"); //display this finalize massage when obj is destroyed automatically by java garbage collector
    }
}
