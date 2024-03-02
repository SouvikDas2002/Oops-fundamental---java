package packages.sub.four_piller.inheritance.hierarchical;

//Illustration : class A
// class B-> A // class C -> A // class D-> A

class A{
    String className;
    A(String className ){
        this.className=className;
    }
    public void print(){
        System.out.println("I am from :"+className);
    }
}
class B extends A{
    String child;
    B(String parent,String child){
        super(parent);
        this.child=child;
    }
    public void print(){
        System.out.println("I am from :"+child+" extends : "+super.className);
    }
}
class C extends A{
    String anotherChild;
    C(String parent,String anotherChild){
        super(parent);
        this.anotherChild=anotherChild;
    }
    public void print(){
        System.out.println("I am from :"+anotherChild+" extends : "+super.className);
    }
}

public class Main {
    public static void main(String[] args) {
    A a=new A("a");
    a.print();
    B b=new B("a","b");
    b.print();
    C c=new C("a","c");
    c.print();
    }
}
