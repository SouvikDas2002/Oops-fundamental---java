package packages.sub.objectClass;

public class ObjectDemo {
    int num;
    int gpa;
    ObjectDemo(int num){
        this.num=num;
    }
    ObjectDemo(int num,int gpa){
        this.num=num;
        this.gpa=gpa;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num==((ObjectDemo) obj).num; //checking the obj num
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34);
        System.out.println(obj.hashCode());

        ObjectDemo obj1=new ObjectDemo(34,9);
        ObjectDemo obj2=new ObjectDemo(34,9);
        ObjectDemo obj3=obj2; //this is equal as both instance reffering the same object
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }else{
            System.out.println("not equal");
        }
        System.out.println(obj1 instanceof ObjectDemo);//true
        System.out.println(obj1 instanceof Object);//true;

        System.out.println(obj1.getClass().getName());
    }
}
