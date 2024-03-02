package packages.sub.subpackage2.a;
import packages.sub.subpackage2.b.Message;

public class Greeting {
    public void abc() {
        for(int i=0;i<3;i++){
            System.out.println("greetings from subpackage 2-a");
        }
        Message.message();
    }
}
