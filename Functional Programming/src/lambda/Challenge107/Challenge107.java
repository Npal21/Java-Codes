package lambda.Challenge107;

import java.util.List;

//107.	Convert an array of strings into a stream. Then, use the
// stream to print each string to the console.
public class Challenge107 {
    public static void main(String[] args) {

        List<String> list = List.of("Hare","Krishna","Ram",
                "Krishna","Hari","Radha","Shyam","Balraam",
                "Subhadra");

        list.stream()
             .forEach( name -> System.out.println(name));

    }
}
