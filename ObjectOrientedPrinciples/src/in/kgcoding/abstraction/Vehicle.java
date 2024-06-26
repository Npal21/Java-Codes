package in.kgcoding.abstraction;

public abstract class Vehicle implements Transport{
    private int numberOfTyres;
    //no default constructor here

    public abstract void makeStartSound();
    public Vehicle(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void commute(){
        System.out.println("Going...");
    }

}
