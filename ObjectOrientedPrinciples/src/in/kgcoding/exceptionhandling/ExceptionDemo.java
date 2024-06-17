package in.kgcoding.exceptionhandling;

import java.sql.SQLOutput;

class MyException extends Throwable{
    public MyException(String message){
        super(message); //Calling the constructor of Throwable in
                        // order to access e.getMessage() with this message.
                        //public Throwable( String message )
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int ans = 0;
        try {

            if(j == 0)
                throw new MyException("Please enter a non-zero number.");
            else
                ans = i / j;
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero!\n " +
                    "Please enter a valid input.\n"+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong!"+e);
        }
        System.out.println(ans);
        System.out.println("I am written after catch blocks.");
    }
}
