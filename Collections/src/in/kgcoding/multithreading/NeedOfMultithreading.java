package in.kgcoding.multithreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //first task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.print(i+ "* ");
        }
        System.out.println();
        //second task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.print(i+ "$ ");
        }
        System.out.println();
        //third task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.print(i+ "& ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken = "+(endTime - startTime)+" ms");
    }
}
