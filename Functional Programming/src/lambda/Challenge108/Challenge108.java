package lambda.Challenge108;

//108.	Given a list of strings, use stream operations to
// filter out strings that have length of 10 or more
// and then concatenate the remaining strings.

import java.util.List;

public class Challenge108 {
    public static void main(String[] args) {
        List<String> names = List.of("HareKrishnaa","Ram",
                "Krishna","Hari","RadheShyaama","Balraam",
                "Subhadra","RadhaVallabhaLal");

        String newNames = names.stream()
                .filter(name -> name.length() >= 10)
                .reduce(" ", (a,b) -> a +" "+ b );

        System.out.println(newNames);


    }
}
