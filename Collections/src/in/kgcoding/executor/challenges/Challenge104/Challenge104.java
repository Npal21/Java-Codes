package in.kgcoding.executor.challenges.Challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Challenge104 {

    public static void main(String[] args) {

        try(ExecutorService service = Executors.newFixedThreadPool(3);) {
            for (int i = 1; i <= 10; i++) {
                SleepTask task = new SleepTask();
                service.submit(task);
            }
            service.shutdown();
            try {
                if (!(service.awaitTermination(20, TimeUnit.SECONDS))) {
                    service.shutdownNow();
                    System.out.println("EMERGENCY SHUTDOWN!");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
