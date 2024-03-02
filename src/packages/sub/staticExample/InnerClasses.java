package packages.sub.staticExample;


//outer class cant be static
//    class Test{
//        static String name;
//        public Test(String name){
//            Test.name=name;
//        }
//    }
public class InnerClasses {
   static class Test{
         String name;
        public Test(String name){
            this.name=name;
        }

       @Override
       public String toString() {
           return this.name;
       }
   }
    public static void main(String[] args) {

        Test a=new Test("souvik");
        Test b=new Test("akash");

//        new Test("suva");
//        System.out.println(a.name);
//        System.out.println(b.name);
        String ans=a.toString();
        System.out.println(ans);
    }
}
