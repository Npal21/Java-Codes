import java.util.Scanner;

public class ReverseDigitsOfNumber {

   int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    int reverseDigits(int n){
       int newNum = 0;
        while(n>=1){
            int digit = n%10;
            newNum = newNum * 10 + digit;
            n/=10;
        }
        return newNum;
    }

    public static void main(String[] args) {
        ReverseDigitsOfNumber p = new ReverseDigitsOfNumber();
        int n = p.acceptUserInput();
        System.out.print("The reverse of digits of "+ n +" is: ");
        System.out.println(p.reverseDigits(n));
    }
}
