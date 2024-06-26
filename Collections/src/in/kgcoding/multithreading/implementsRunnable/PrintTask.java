package in.kgcoding.multithreading.implementsRunnable;

public class PrintTask implements Runnable{

    private final String character;

    public PrintTask(String character) {
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

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        PrintTask p1= new PrintTask("*");
        Thread t1 = new Thread(p1);
        t1.start();
        PrintTask p2 = new PrintTask("$");
        new Thread(p2).start();
        PrintTask p3 = new PrintTask("#");
        new Thread(p3).start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken = "+(endTime - startTime)+" ms " +
                Thread.currentThread().getName());
    }
}
