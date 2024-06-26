//99. Write a program that creates two threads.
// Each thread should print "Hello from Thread X",
// where X is the number of the thread (1 or 2), ten times, then terminate.

package in.kgcoding.multithreading.Challenge99;

public class Testing99 {

    public static void main(String[] args) throws InterruptedException {

        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);
        t1.start();
        t1.join();
        System.out.println("=========================================");
        t2.start();
        t2.join();




    }
}
