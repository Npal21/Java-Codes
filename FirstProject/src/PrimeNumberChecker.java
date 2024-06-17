import java.util.Scanner;

public class PrimeNumberChecker {

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    boolean isPrimeNumber(int n){
        int i = 2;
        while (i < n){      //loop from 2 to n-1
            if(n%i == 0)
                return false;
            i++;
        }
       return true;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        PrimeNumberChecker p = new PrimeNumberChecker();
        int n = p.acceptUserInput();
        if(p.isPrimeNumber(n))
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is NOT a prime number");
    }
}
