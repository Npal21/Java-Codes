package in.kgcoding.abstraction;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(){
        super(4);       //this is compulsory in abstraction,bcoz parent class has no default constructor

    }

    @Override
    public void makeStartSound() {   //It is compulsory for child class to implement all abstract methods of parent class
        System.out.println("Car starting Brrooooommmmmm.......");
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place b from place A...");
    }
}
