package in.kgcoding.multithreading.Challenge102;

public enum TrafficColor {
    RED(9000),
    GREEN(3000),
    YELLOW(1000);

    private final int onTimeInMillis;

    private TrafficColor(int time){
        this.onTimeInMillis = time;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }



}
