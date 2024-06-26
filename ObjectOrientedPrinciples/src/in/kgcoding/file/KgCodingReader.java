package in.kgcoding.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KgCodingReader {
    public static void main(String[] args) {

            String fileName = "java-course.txt";

            try(FileReader reader = new FileReader(fileName)){
                int character = 0;
                do{
                    character = reader.read();
                    System.out.print((char) character);

                }while(character != -1);

//            while((character = reader.read()) != -1){
//                System.out.print((char) character);
//            }

            }catch(IOException e){
                System.out.println("IOException occurred" + e.getMessage());

            }






    }
}
