import java.util.Scanner;

public class AgeCategorize {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 13 && age >= 0){
                System.out.println("You are a Child");
            }
            else if (age < 20 && age >= 13){
                System.out.println("You are a Teenager");
            }
            else if (age < 60 && age >= 13){
                System.out.println("You are an Adult");
            }
            else if (age >= 60 && age < 500){
                System.out.println("You are a Senior");
            }
            else
                System.out.println("Please enter valid age!");
        }
}


