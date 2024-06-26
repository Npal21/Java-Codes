import java.util.Scanner;

public class LCM {
    int number;

    int acceptUserInput(){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    int LCM(int n1, int n2){
        int lcm = 1, multiple = 1;
        for(int i = 1; i<=n2; i++){
            multiple = n1 * i;
            if(multiple % n2 == 0) {
                return multiple;

            }
        }
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println("Please enter numbers of find LCM: ");
        LCM obj = new LCM();
        int n1 = obj.acceptUserInput();
        int n2 = obj.acceptUserInput();
        System.out.println("The LCM is : "+obj.LCM(n1,n2));

    }
}
