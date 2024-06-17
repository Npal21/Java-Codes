import java.util.Scanner;

public class SumOfOddNumbers {
    int n;

    public static int acceptUserInput(){
        System.out.print("Please enter a number to add all odd number till this number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //Formula of sum of first n odd numbers = n^2 ie. n-square
    //Find the sum of odd numbers 1 to 50. -->EVEN NUMBER
    //Sol= (50/2)^2;
    //Find the sum of odd numbers 1 to 199. -->ODD NUMBER
    //Sol= ((199+1)/2)^2;
    public static int sumOfAllOddNumbers(int n){
        int sum = 0, i =0;
        while(i<=n) {
            if (i % 2 != 0) {       //odd number
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = acceptUserInput();
        System.out.println("The sum of all odd number from 1 to "+n+" is: "+sumOfAllOddNumbers(n));
    }
}
