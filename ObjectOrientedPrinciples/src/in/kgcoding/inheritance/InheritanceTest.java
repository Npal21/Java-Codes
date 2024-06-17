package in.kgcoding.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println("=============Methods from Object class==============");
        System.out.println(vehicle.toString());     //string representation of object
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());     //get the name of the class

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();


    }
}
