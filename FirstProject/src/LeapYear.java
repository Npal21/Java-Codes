import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter input year to check if leap or not: ");
        int year = sc.nextInt();
        if (year % 400 == 0 )
            System.out.println(year + " : It's a leap century year!");
        else if(year % 4 == 0 )
            System.out.println(year + " : It's a leap year!");
        else
            System.out.println(year + " : It's NOT a leap year!");
    }
}
