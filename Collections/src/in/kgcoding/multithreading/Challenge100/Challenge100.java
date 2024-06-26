//100.	Write a program that starts a thread and prints its
//state after each significant event (creation, starting, and termination).
//Use Thread.sleep() to simulate long-running tasks and
//Thread.getState() to print the thread's state.

package in.kgcoding.multithreading.Challenge100;

public class Challenge100 {

    public static void main(String[] args) throws InterruptedException {

        ThreadState t1= new ThreadState();
        System.out.println(t1.getName() + " created. State = " + t1.getState());
        t1.start();
        System.out.println(t1.getName()+ " started. State = " + t1.getState());
        t1.join();
        System.out.println(t1.getName()+ " finished. State = " + t1.getState());




    }

}
