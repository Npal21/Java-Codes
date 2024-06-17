package in.kgcoding.multithreading.Challenge101;

public class Threads implements Runnable{

    private final int threadNumber;

    public Threads(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("====================================");
        System.out.println("Starting Thread-" + threadNumber + " . State = "
                + Thread.currentThread().getState());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Ending Thread-" + threadNumber + " . State = "
                + Thread.currentThread().getState());
    }


}
