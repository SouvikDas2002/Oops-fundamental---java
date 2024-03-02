package packages.sub.introduction;

import packages.sub.subpackage2.a.Greeting;

class Student{
    int roll;
    String name;
    float marks;

     Student(){ //default contructor
//        this.roll=1188; //this represents s1 object
//        this.name="SD";
//        this.marks=85.5f;

//        also can call another constructor from inside a constructor
//         internally this represent by packages.sub.introduction.Student(13,"default name",1000);
         this(13,"default name",1000);
    }
    Student(int roll,String name,float marks){ //parameterized constructior
        this.roll=roll;  //this will represent s2 object internally
        this.name=name;
        this.marks=marks;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1=new Student();

        Student s2=new Student(1018,"Akash",90.5f);

        Student s3=new Student();
        s3=s2;  //copy the refference means two different objects pointing to same reference

        s3.name="Akash mandal";

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        System.out.println(s2.name+" "+s2.roll+" "+s2.marks);
        System.out.println(s3.name+" "+s3.roll+" "+s3.marks);

        Greeting obj=new Greeting();
        obj.abc();

        packages.sub.subpackage2.b.Greeting obj2=new packages.sub.subpackage2.b.Greeting();
        obj2.greet2();
    }
}
