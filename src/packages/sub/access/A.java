package packages.sub.access;

public class A {
    private int num; //data is hidden
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }
    public void setNum(){
        this.num=num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }
}
