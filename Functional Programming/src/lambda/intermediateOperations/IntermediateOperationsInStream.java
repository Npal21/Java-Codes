package lambda.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsInStream {
    public static void main(String[] args) {

        //Using sorted()
        List<Integer> numbers = List.of(10,2,5,3,7,8);
         numbers.stream()
                .sorted()
                .forEach(n -> System.out.print(n + ", "));

         List<Integer> sortedList = numbers.stream()
                 .sorted()
                 .toList();     //collect(Collectors.toList())
        System.out.println("\nSorted list is: "+sortedList);

        //Using distinct() with Integer list
        List<Integer> repeatedList = Arrays.asList(2,4,5,2,7,2,4,6,2,5);
        List<Integer> distinctList = repeatedList.stream()
                .distinct()
                .toList();      //collect(Collectors.toList())

        System.out.println("\n Distinct elements are: "+distinctList);

        //Using distinct() with String list
        List<String> fruits = List.of("Apple","apple","banana","banana",
                "mango","cherry","cherry");
        List<String> distinctFruits= fruits.stream()
                .distinct()         //It is case-sensitive
                .toList();          //collect(Collectors.toList())
        System.out.println("Distinct elements are: " + distinctFruits);

        //Using map()
        List<String> upperCaseFruits = fruits.stream()
                                        .map(String::toUpperCase)
                                        .toList();
        System.out.println(upperCaseFruits);


    }

}
