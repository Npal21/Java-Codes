import java.io.IOException;
import java.util.Scanner;

public class ProductOfFloatingNumbers {
    float num1,num2;
    double multiply(float n1, float n2){
        return n1*n2;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication of FLOATING point Numbers!");
        ProductOfFloatingNumbers obj1 = new ProductOfFloatingNumbers();
        try{

        System.out.print("Please enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Please enter second number: ");
        float num2 = sc.nextFloat();
        System.out.println("Product: " + obj1.multiply(num1,num2));
        }
        catch(Exception e){
            System.out.println("You entered something other than float");
        }


    }

}
