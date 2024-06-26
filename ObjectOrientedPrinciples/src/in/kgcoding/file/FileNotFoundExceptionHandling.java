package in.kgcoding.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the filename you want to open: ");
        String fileName = sc.next();
        try(FileReader reader = new FileReader(fileName)){
            int character = 0;
            while((character = reader.read()) != -1)
                System.out.print((char) character);

        }catch(FileNotFoundException e){
            System.out.println(fileName + " file not found!! "+ e.getMessage());
        }catch (IOException e){
            System.out.println("IOException: "+ e.getMessage());
        }


    }
}
