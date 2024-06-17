package in.kgcoding;

public class Car {
    public String color;
    public String model;
    long costOfPurchase;        //default : access within package only
    private double fuelLevel;

    public Car(){}

    public Car(String color, String model, long costOfPurchase, double fuelLevel) {
        this.color = color;
        this.model = model;
        this.costOfPurchase = costOfPurchase;
        this.fuelLevel = fuelLevel;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", costOfPurchase=" + costOfPurchase +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

}
