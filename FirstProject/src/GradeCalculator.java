import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks to know your grade: ");
        int marks = sc.nextInt();
       if (marks >= 90 && marks <= 100){
           System.out.println("You got A grade");
       }
       else if (marks >= 75 && marks < 90){
           System.out.println("You got B grade");
       }
       else if (marks >= 60 && marks < 75){
           System.out.println("You got C grade");
       }
       else if (marks >= 30 && marks < 60){
           System.out.println("You got D grade");
       }
       else if (marks < 30 && marks >= 0){
           System.out.println("You Failed the exam.");
       }
       else
           System.out.println("Please enter a valid input!");
    }
}
