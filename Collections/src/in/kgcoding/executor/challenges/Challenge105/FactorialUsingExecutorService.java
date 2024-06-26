package in.kgcoding.executor.challenges.Challenge105;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class FactorialUsingExecutorService {
    public static void main(String[] args) {

        List<Future<Integer>> list = new ArrayList<>();

        try(ExecutorService service= Executors.newFixedThreadPool(3)){

            for(int i = 1; i <= 10; i++){
                FactorialTask task = new FactorialTask(i);
                list.add(service.submit(task));
            }
            for(Future<Integer> future : list) {
                System.out.println("\nFactorial = " + future.get());
            }
            service.shutdown();

            if(!(service.awaitTermination(10, TimeUnit.SECONDS))){
                System.out.println("Oops! Time out..");
                service.shutdownNow();
            }

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

}
