package in.kgcoding.executor.challenges.Challenge105;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {

    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        int factorial = 1;

        if(number <= 1)
            return 1;

        for(int i=number; i>1; i--){
           factorial *= i;
        }
        return factorial;
    }
}
