package in.kgcoding.executor.challenges.Challenge104;

public class SleepTask implements Runnable{

    @Override
    public void run() {
        System.out.println("==============================");
        System.out.println("Started current "+Thread.currentThread().getName() );
        try {
            Thread.sleep(getRandom() * 1000);
            System.out.println("Random = "+getRandom() + " - " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Ended current "+Thread.currentThread().getName() );
    }

    private int getRandom(){
        return (int)(Math.random()* 5 + 1);
        /* int Random = (min.value ) + (int)(Math.random()* ( Max - Min + 1));
  *Where min is the smallest value You want to be the smallest number possible to
  generate and Max is the biggest possible number to generate*/
    }
}
