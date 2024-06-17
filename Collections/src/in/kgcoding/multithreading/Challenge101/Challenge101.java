//101.	Create three threads. Ensure that the second thread
// starts only after the first thread ends and
// the third thread starts only after the second thread ends
// using the join method. Each thread should print its
// start and end along with its name.
package in.kgcoding.multithreading.Challenge101;

public class Challenge101 {
    public static void main(String[] args) throws InterruptedException {

        Threads p1 = new Threads(1);
        Thread t1 = new Thread(p1);
        t1.start();

        Threads p2 = new Threads(2);
        Thread t2 = new Thread(p2);
        t1.join();

        t2.start();

        Threads p3 = new Threads(3);
        Thread t3 = new Thread(p3);

        t2.join();
        t3.start();
        t3.join();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());

    }
}
