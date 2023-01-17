package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
        //final int a = Car.a;
//        car.acc();
//        car.start();
//        car.stop();
        //System.out.println(a);

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
