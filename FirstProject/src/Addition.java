import java.util.Scanner;

public class Addition {

    public int sum = 0;

    int sum(int a, int b){
        return a+b;
    }

    void swap(int a, int b){
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Addition obj = new Addition();

        System.out.println("The sum of " + num1 + " and " + num2 + " is :" + obj.sum(num1,num2));
        System.out.println("Swapping program: ");
        obj.swap(num1, num2);


    }
}

/*

Please enter two number to add: 85
475
The sum of 85 and 475 is :560
 */