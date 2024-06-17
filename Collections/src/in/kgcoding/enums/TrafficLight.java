package in.kgcoding.enums;

public enum TrafficLight {

    //Actions to do when these lights appear
    RED("Stop"), YELLOW("Slow"), GREEN("Go");

    private final String action;

    TrafficLight(String action){
        this.action = action;
    }
}
