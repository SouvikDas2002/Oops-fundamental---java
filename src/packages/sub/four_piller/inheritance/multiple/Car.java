package packages.sub.four_piller.inheritance.multiple;

public class Car implements Break,Engine,Media{
    @Override
    public void brake() {
        System.out.println("Stop the car");
    }

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Engine");
    }

    @Override
    public void acc() {

    }
}
