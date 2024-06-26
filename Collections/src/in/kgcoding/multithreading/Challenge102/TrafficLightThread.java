package in.kgcoding.multithreading.Challenge102;

public class TrafficLightThread extends Thread{

    private final TrafficColor signalColor;

    public TrafficLightThread(TrafficColor signalColor) {
        this.signalColor = signalColor;
    }

    public synchronized void run(){

        System.out.println(signalColor+" signal is ON.");
        try {
            Thread.sleep(signalColor.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(signalColor+" signal is OFF.");


    }
}
