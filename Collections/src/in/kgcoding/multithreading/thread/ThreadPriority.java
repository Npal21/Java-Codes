package in.kgcoding.multithreading.thread;

public class ThreadPriority extends Thread{

    final String character;

    public ThreadPriority(String character) {
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
        ThreadPriority p1 = new ThreadPriority("*");
        p1.setPriority(MIN_PRIORITY);
        p1.start();
        ThreadPriority p2 = new ThreadPriority("$");
        p2.setPriority(MAX_PRIORITY);
        p2.start();
        ThreadPriority p3 = new ThreadPriority("#");
        p3.setPriority(NORM_PRIORITY);
        p3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken = "+(endTime - startTime)+" ms " +
                Thread.currentThread().getName());

    }
}
