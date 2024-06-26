package in.kgcoding.multithreading.Challenge99;

public class HelloThread extends Thread{

    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run(){

        for (int i = 1; i <= 10; i++) {
            System.out.println("("+i+")"+" Hello from Thread - "+ threadNumber);
        }

    }
}
