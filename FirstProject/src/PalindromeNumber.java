import java.util.Scanner;

public class PalindromeNumber {

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    int reverseDigits(int n){
        int newNum = 0;
        while(n>=1){
            int digit = n%10;
            newNum = newNum*10 + digit;
            n/=10;
        }
        return newNum;
    }
    boolean isPlaindrome(int number){
        return (number == reverseDigits(number));
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        int n = p.acceptUserInput();
        if(p.isPlaindrome(n))
            System.out.println(n+" is Palindrome number");
        else
            System.out.println(n+" is not a Palindrome number");

    }
}
