import java.util.Scanner;

public class Factorial {

    int number;

    long factorial(int n){
        if(n<2)
            return 1;

        long product = 1, dummy = n;
        while((dummy-1) >= 1){
            if(dummy == n){
                product = dummy*(dummy-1);
            }
            else{
                product *= (dummy-1);
                System.out.println(product);
            }
            dummy--;
        }
        return product;
    }

    int acceptUserInput(){
        System.out.print("Please enter a number to generate factorial: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int number = f.acceptUserInput();
        long factorial = f.factorial(number);
        System.out.println("Factorial of "+number+" is : "+factorial);
    }
}


//3 = 3 * 2 * 1
//4 = 4 * 3 * 2 * 1
//5 = 5 * 4 * 3 * 2 * 1