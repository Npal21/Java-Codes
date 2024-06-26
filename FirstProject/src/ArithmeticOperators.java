import java.util.Scanner;

public class ArithmeticOperators {
    int number1, number2;

    void setter(int num1, int num2){
        this.number1 = num1;
        this.number2 = num2;
    }
    int getNumber1(){
        return number1;
    }
    int getNumber2(){
        return number2;
    }
    int add( int num1, int num2){
        return num1+num2;
    }
    int subtract( int num1, int num2){
        return num1-num2;
    }
    int multiply( int num1, int num2){
        return num1*num2;
    }
    int divide( int num1, int num2){
        return num1/num2;
    }
    int mod( int num1, int num2){
        return num1%num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operators");
        System.out.print("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = sc.nextInt();

        ArithmeticOperators obj1 = new ArithmeticOperators();

        System.out.println("Addition: " + obj1.add(num1,num2));
        System.out.println("Subtraction: " + obj1.subtract(num1,num2));
        System.out.println("Multiplication: " + obj1.multiply(num1,num2));
        System.out.println("Division: " + obj1.divide(num1,num2));
        System.out.println("Modulus: " + obj1.mod(num1,num2));
    }
}
