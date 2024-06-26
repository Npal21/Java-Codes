import java.util.Scanner;

public class GCD {
    int number;

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    int GCD(int n1, int n2){
        int gcd = 1, i = 1;
        int least = least(n1,n2);
        while(i <= least){
            if(n1%i == 0 && n2%i == 0){     //i divides both n1 and n2
                gcd = i;
            }
            i++;
        }


        return gcd;
    }

    int least(int n1, int n2) {
        return (n1<n2) ? n1 : n2;
    }

    public static void main(String[] args) {
        System.out.println("Please enter numbers of find LCM: ");
        GCD obj = new GCD();
        int n1 = obj.acceptUserInput();
        int n2 = obj.acceptUserInput();
        System.out.println("The GCD is : "+obj.GCD(n1,n2));

    }
}
