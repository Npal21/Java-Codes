import java.util.Scanner;

public class NumberType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();
        if(input > 0)
            System.out.println("You have entered POSITIVE number: "+ input);
        else if(input  < 0)
            System.out.println("You have entered NEGATIVE number: " + input);
        else
            System.out.println("You have entered ZERO: " + input);
    }
}
