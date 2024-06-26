import java.util.Scanner;

public class FibonacciSeries {

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    void fibonacci(int n){
        int i = 0, sum = 0;
        int n1 = 0, n2 = 1;
        while((n1+n2) <= n){
            sum = n1 + n2;
            System.out.print(sum + " ");
            n1= n2;
            n2 = sum;
        }

    }

    public static void main(String[] args) {
        FibonacciSeries p = new FibonacciSeries();
        int n = p.acceptUserInput();
        System.out.print("The Fibonacci series of "+ n +" is: ");
        p.fibonacci(n);
    }
}

//OUTPUT
//Please enter number: 50
//The Fibonacci series of 50 is: 1 2 3 5 8 13 21 34