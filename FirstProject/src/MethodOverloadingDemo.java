import java.util.Scanner;

class Calcu{
    int n1, n2;

    int add(int num1, int num2){
        return num1 + num2;
    }
    int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    double add(double n1, int n2){
        return n1+n2;
    }
    String add(String s1, String s2){
        return s1+s2;
    }

}


public class MethodOverloadingDemo {

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }
    double acceptUserInput(double d){                               //does not work without params
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextDouble();
    }

    String acceptUserInput(int n){
        System.out.print("Please enter a string: ");
        Scanner sc = new Scanner(System.in);
        return  sc.next();
    }

    public static void main(String[] args) {
        Calcu c = new Calcu();                  //NOT AN OBJECT, BUT A REFERENCE VARIABLE --> Creates a new object in the HEAP memory
        MethodOverloadingDemo m = new MethodOverloadingDemo();      //NOT AN OBJECT, BUT A REFERENCE VARIABLE

        int n1 = m.acceptUserInput();
        int n2 = m.acceptUserInput();
        int n3 = m.acceptUserInput();
        String s1 = m.acceptUserInput(3);
        String s2 = m.acceptUserInput(3);
        double d1= m.acceptUserInput(2.2);

        System.out.println("Sum of two numbers: "+c.add(n1,n2));
        System.out.println("Sum of two numbers: "+c.add(n1,n2,n3));
        System.out.println("Sum of two Strings: "+c.add(s1,s2));
        System.out.println("Sum of two numbers-double: "+c.add(d1,n1));




    }


}
