import java.util.Scanner;

public class AdditionClassDemo {

    int acceptUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        AdditionClassDemo obj =  new AdditionClassDemo();
        Calculator calc = new Calculator();
        int n1 = obj.acceptUserInput();
        int n2 = obj.acceptUserInput();
        System.out.println("Addition: "+n1 +" + "+n2+" = "+calc.add(n1, n2));
        System.out.println("Subtraction: "+n1 +" - "+n2+" = "+calc.subtract(n1, n2));
        System.out.println("Multiplication: "+n1 +" * "+n2+" = "+calc.multiply(n1, n2));
        System.out.println("division: "+n1 +" / "+n2+" = "+calc.divide(n1, n2));
    }
}

class Calculator{
    int n1, n2;

    int add(int n1, int n2){
        return n1 + n2;
    }

    int subtract(int n1, int n2){
        return n1 - n2;
    }
    int multiply(int n1, int n2){
        return n1 * n2;
    }
    int divide(int n1, int n2){
        return n1 / n2;
    }

}