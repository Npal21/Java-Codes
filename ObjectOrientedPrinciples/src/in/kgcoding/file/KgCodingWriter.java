package in.kgcoding.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {

//        File fileName = new File("java-course");
//        try{
//            FileWriter writer = new FileWriter(fileName);
//            writer.write("This is java course by Prashant sir.\n");
//            writer.write("This is awesome.");
//            writer.flush();
//            System.out.println("File written successfully");
//            writer.close();       //This is my headache to close it here!
//
//        }catch(IOException e){
//            System.out.println("IOException occurred"+ e.getMessage());
//        }

        //java with resource: try()= whatever inside brackets will be taken care by java to close it after use
        File file = new File("java-course.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("This is java course by Prashant sir.\n");
            fileWriter.write("This is awesome.\n");
            for(int i=0;i<10000;i++){
                fileWriter.write("* ");
            }
            fileWriter.flush();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println("IOException occurred!!"+ e.getMessage());
        }
    }
}
//Note: FileWriter and FileReader are throwing checked exception 'IOException'