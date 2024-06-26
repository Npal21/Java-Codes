import java.util.Scanner;

public class SumOfDigitsOfInteger {

    int number;

    int acceptUserInput(){
        System.out.print("Please enter a number to generate sum of its digits: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }
    int sumOfAllDigits(int n){
        int sum = 0;
        do{
           sum = sum + (n % 10) ;
           System.out.println("sum = "+ sum);
           n = n/10;
            System.out.println("n = "+ n);
        }while(n != 0);
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigitsOfInteger s = new SumOfDigitsOfInteger();
        int input = s.acceptUserInput();
        System.out.println(s.sumOfAllDigits(input));
    }
}
