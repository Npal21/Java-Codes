package in.kgcoding.multithreading.thread;

public class PrintTask extends Thread{

    final String character;

    public PrintTask(String character) {
        this.character = character;
    }

    public void run(){
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i+character+ " ");
        }
        System.out.println("\nTask done for "+
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask("*");
        p1.start();
        PrintTask p2 = new PrintTask("$");
        p2.start();
        PrintTask p3 = new PrintTask("#");
        p3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken = "+(endTime - startTime)+" ms " +
                Thread.currentThread().getName());



    }
}
