package in.kgcoding.executor.challenges.Challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge103 {


    public static void main(String[] args) {
        PrintNumbers task1 = new PrintNumbers();
        try(ExecutorService service = Executors.newSingleThreadExecutor();){
            service.submit(task1);
            service.shutdown();

        }



    }
}
