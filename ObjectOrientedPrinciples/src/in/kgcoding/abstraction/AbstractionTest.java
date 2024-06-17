package in.kgcoding.abstraction;

public class AbstractionTest {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle(2);   //Can't instantiate abstract class
        Car car= new Car();
        car.commute();
        System.out.println(car.getNumberOfTyres());
        car.setNumberOfTyres(10);
        System.out.println(car.getNumberOfTyres());
        car.makeStartSound();
        car.getSetGo();
    }
}
