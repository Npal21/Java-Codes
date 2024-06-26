package in.kgcoding.inheritance;

public class MotorCycle extends TwoWheeler{
    private double fuelCapacity;

    protected MotorCycle(){
        setFuelType("Petrol");
    }

    protected void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    protected double getFuelCapacity(){
        return fuelCapacity;
    }

    public void start(){
        System.out.println("Starting");
    }
}
