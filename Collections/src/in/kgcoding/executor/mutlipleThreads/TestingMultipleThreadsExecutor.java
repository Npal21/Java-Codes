package in.kgcoding.executor.mutlipleThreads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultipleThreadsExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintTask2 task1 = new PrintTask2('*');
        PrintTask2 task2 = new PrintTask2('$');
        PrintTask2 task3 = new PrintTask2('%');
        PrintTask2 task4 = new PrintTask2('@');
        PrintTask2 task5 = new PrintTask2('^');
        PrintTask2 task6 = new PrintTask2('!');

//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);
//        service.submit(task4);
//        service.submit(task5);
//        service.submit(task6);

        /*
        1* 2* 3* 4* 5* 6* 7* 8* 9* 10* .........
        pool-1-thread-2 : Task completed.
        pool-1-thread-1 : Task completed.
        1% 2% 3% 1@ 2@ 3@ 4@ 5@ 6@ 7@ 4%.........
        pool-1-thread-2 : Task completed.
        711@ 1^ 2^ 3^ 4^ 5^ 6^ 7^ 8^ 712@ 713@.........
        pool-1-thread-1 : Task completed.
        1! 2! 3! 4! 5! 6! 7! 8! 9! 10! 11!.........
        pool-1-thread-2 : Task completed.
        796! 797! 798! 799! 800! 801! 802!.........
        pool-1-thread-1 : Task completed.
         */
//=================================================================================================

        //Assigning multiple tasks to ExecutorService in for loop
        for (int i = 1; i <= 10; i++) {
            PrintTask2 task = new PrintTask2((char)(i*15));
            service.submit(task);
        }

        service.shutdown();

        //Wait for all tasks to finish by 10 seconds
        System.out.println("\n************1");
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            //forcefully stop all the threads execution
            System.out.println("\n************2 TIME UP!!");
            service.shutdownNow();
        }


    }
}

