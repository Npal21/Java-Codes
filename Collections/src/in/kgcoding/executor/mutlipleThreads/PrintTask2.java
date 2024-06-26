package in.kgcoding.executor.mutlipleThreads;

public class PrintTask2 extends Thread{

    private final char targetChar;

    public PrintTask2(char targetChar){
        this.targetChar = targetChar;
    }

    public char getTargetChar() {
        return targetChar;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.println("\n" + Thread.currentThread().getName() + " : Task completed.");
    }
}
