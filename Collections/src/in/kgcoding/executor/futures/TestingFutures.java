package in.kgcoding.executor.futures;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        PrintFullName task1 = new PrintFullName("Radha");
        PrintFullName task2 = new PrintFullName("Shyam");
        PrintFullName task3 = new PrintFullName("Krishna");
        PrintFullName task4 = new PrintFullName("Balraam");
        PrintFullName task5 = new PrintFullName("Subhadra");

       Future<String> name1 = service.submit(task1);
       Future<String> name2 = service.submit(task2);
       Future<String> name3 = service.submit(task3);
       Future<String> name4 = service.submit(task4);
       Future<String> name5 = service.submit(task5);

        try {
            System.out.println("Full name is: "+name1.get()); //main thread stops here, waiting for the response
            System.out.println("Full name is: "+name2.get());
            System.out.println("Full name is: "+name3.get());
            System.out.println("Full name is: "+name4.get());
            System.out.println("Full name is: "+name5.get());


        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();

    }
}
