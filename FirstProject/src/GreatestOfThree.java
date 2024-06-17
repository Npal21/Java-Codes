import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter three numbers to compare: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        if(num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the greatest among ("+ num1+","+ num2+","+ num3+")");
        else if(num2 >= num3)
            System.out.println(num2 + " is the greatest among ("+ num1+","+ num2+","+ num3+")");
        else
            System.out.println(num3 + " is the greatest among ("+ num1+","+ num2+","+ num3+")");

    }
}
