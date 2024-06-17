package in.kgcoding.executor.challenges.Challenge103;

public class PrintNumbers implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("\nNumber is "+i+" ");
        }
    }
}
