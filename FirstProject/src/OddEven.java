import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();
        if(input%2 == 0)
            System.out.println("You entered an even number");
        else if(input%2 != 0) {
            System.out.println("You entered an odd number");
        }
    }
}
