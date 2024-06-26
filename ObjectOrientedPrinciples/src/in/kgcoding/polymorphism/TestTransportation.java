package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        //castTest(vehicle);
        castTest(car);

        Vehicle v = new Car();  //upcasting: allowed bcoz car is a vehicle
        //Car c = (Car) new Vehicle();    //NOT ALLOWED
        Object o = new Car();
        Object o1 = new Vehicle();
    }

    private static void castTest(Vehicle veh){
        //veh.start();
        Car car = (Car) veh;        //downcasting
        car.start();
    }
}
