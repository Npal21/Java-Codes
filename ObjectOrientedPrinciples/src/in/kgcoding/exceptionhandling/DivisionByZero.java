package in.kgcoding.exceptionhandling;

import java.util.Scanner;

public class DivisionByZero {

    public static void main(String[] args) {
        a();
    }

    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();

        try{
            int div = n1/n2;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.printf("%s, Enter valid number",e.getMessage());
        }
        catch(Exception e){
            System.out.println("Enter valid input");
        }
        finally {
            System.out.println("I am in finally");
        }
    }
}
