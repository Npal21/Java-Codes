//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void firstPattern(){
        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void main(String[] args) {

//      System.out.println("*\n* *\n* * *\n* * * *\n* * * * *\n");
//      System.out.println("-------------------------------------");
//      System.out.println("* * * * *\n* * * *\n* * *\n* *\n*\n");
//      System.out.println("-------------------------------------");
//      System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *\n");

        //firstPattern();
        secondPattern();

    }

    public static void secondPattern(){
        int rows = 5;
        while(rows > 0){
            System.out.print("*");
            int j = rows-1;
            while(j > 0){
                System.out.print(" *");
                j--;
            }
            rows--;
            System.out.println();
        }

    }

    public static void thirdPattern(){

    }

}
/*
-------------------------------------
*
* *
* * *
* * * *
* * * * *
-------------------------------------
* * * * *
* * * *
* * *
* *
*
-------------------------------------
        *
      * *
    * * *
  * * * *
* * * * *
-------------------------------------

*/
