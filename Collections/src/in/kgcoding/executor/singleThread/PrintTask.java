package in.kgcoding.executor.singleThread;

public class PrintTask extends Thread{

    private final char targetChar;

    public PrintTask(char targetChar){
        this.targetChar = targetChar;
    }

    public char getTargetChar() {
        return targetChar;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.println("\n" + Thread.currentThread().getName() + " : Task completed.");
    }
}
