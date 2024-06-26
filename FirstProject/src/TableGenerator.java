import java.util.Scanner;

public class TableGenerator {
    int number;

    void table(int num){
        for(int i=1 ;i<=10; i++){
            System.out.println(num*i);
        }
    }

    int getter(){
        return number;
    }

    void setter(int num){
        this.number = num;
    }

    int acceptUserInput(){
        System.out.print("Please enter a number to generate multiplication table: ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextInt();
    }

    public static void main(String[] args) {
        TableGenerator t = new TableGenerator();
        int n = t.acceptUserInput();
        t.table(n);
    }
}
