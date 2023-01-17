package interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric motor start");
    }

    @Override
    public void stop() {
        System.out.println("Electric motor stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric motor got powered");
    }
}
