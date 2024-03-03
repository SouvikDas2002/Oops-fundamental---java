package packages.sub.four_piller.inheritance.multiple;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music on");
    }

    @Override
    public void stop() {
        System.out.println("Music off");
    }
}
