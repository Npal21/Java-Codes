import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + " to KGCoding");


    }
}
