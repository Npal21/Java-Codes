import java.util.Scanner;

public class SwitchCase {
    int acceptUserInput(){
        System.out.print("Please enter a number as per days of the week: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    public static void main(String[] args) {
        SwitchCase p = new SwitchCase();
        int n = p.acceptUserInput();

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid input");

        }
    }
}
