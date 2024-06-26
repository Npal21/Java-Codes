package in.kgcoding.multithreading.sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world! Lets meet after 5 seconds");
        Thread.sleep(3000);
        System.out.println("Hey, we are back again!");
        System.out.println("We are in Thread "+Thread.currentThread().getName()+".");
    }
}
