package in.kgcoding.inheritance;

public class Vehicle {
    private int numberOfTyres;
    private String fuelType;

    protected void setTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    protected void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public void commute(){
        System.out.printf("I am going from place A to place B using %d tyres using %s fuel.\n",numberOfTyres,fuelType);
    }

    @Override
    public String toString() {
        return "Number of tyres = "+numberOfTyres;
    }
}
