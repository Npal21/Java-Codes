package in.kgcoding.executor.futures;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class PrintFullName implements Callable<String> {

    private final String fullName;

    public PrintFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

   @Override
    public String call() throws Exception {
        System.out.println("\nFetching full name...");
        Thread.sleep(4000);
        return (fullName + " Bharatiya");
    }
}
