package in.kgcoding.multithreading.Challenge100;

public class ThreadState extends Thread{

    public void run(){
        try {
            Thread.sleep(3000);
            System.out.println("From inside run: "+ getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
