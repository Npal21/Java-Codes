package in.kgcoding.multithreading.join;

public class TestingJoin implements Runnable{

    private final String character;

    public TestingJoin(String character) {
        this.character = character;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i+character+ " ");
        }
        System.out.println("\nTask done for "+
                Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        TestingJoin p1= new TestingJoin("*");
        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\nThread 1 started");

        TestingJoin p2 = new TestingJoin("$");
        new Thread(p2).start();
        System.out.println("\nThread 2 started");

        t1.join();  //main thread waits until t1 is done with its task.

        TestingJoin p3 = new TestingJoin("#");
        new Thread(p3).start();
        System.out.println("\nThread 3 started");

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken = "+(endTime - startTime)+" ms " +
                Thread.currentThread().getName());
    }
}
