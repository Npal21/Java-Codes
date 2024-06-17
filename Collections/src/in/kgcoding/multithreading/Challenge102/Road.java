//102.	Simulate a traffic signal using threads. Create three threads representing
// three signals: RED, YELLOW, and GREEN. Each signal should be on for a certain time,
// then switch to the next signal in order. Use sleep for timing and synchronize to make
// sure only one signal is active at a time.
package in.kgcoding.multithreading.Challenge102;

public class Road {

    public static void main(String[] args) throws InterruptedException {

        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);

        red.start();
        red.join();

        green.start();
        green.join();

        yellow.start();


    }


}
