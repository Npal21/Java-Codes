import java.util.Scanner;

public class ArmstrongNumber {

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    int digitCounter(int n){
        int digits = 0, dummy = n;
        while(n >= 1){
            dummy = dummy%10;
            n/=10;
            digits++;
        }
        return digits;
    }

    boolean isArmstrong(int input){
        int digit = 0, cubeOfdigit = 1, sumOfCubesOfDigit = 0;
        int  n=input;
        int numOfDigits = digitCounter(input);

        while(n >= 1){
            digit = n%10;
            //System.out.println("digit "+digit);
            cubeOfdigit = (int) Math.pow(digit,numOfDigits);
            //System.out.println("cubeOfdigit "+cubeOfdigit);
            sumOfCubesOfDigit += cubeOfdigit;
            //System.out.println("sumOfCubesOfDigit "+sumOfCubesOfDigit);
            n/=10;
            //System.out.println("n "+ n);
        }

        if(sumOfCubesOfDigit == input)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ArmstrongNumber p = new ArmstrongNumber();
        int n = p.acceptUserInput();
        System.out.print("");
        if(p.isArmstrong(n))
            System.out.println(n+" is an Armstrong Number");
        else
            System.out.println(n+" is NOT an Armstrong Number");


    }
}
