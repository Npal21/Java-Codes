package lambda.Optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {

        //Normal no-empty list and reduce operation:
        List<Integer> numbers = List.of(1,7,4,2,3,6);

        int newSum2 = numbers.stream()
                .reduce(0, (a,b) -> a+b);       //only 2 operations in the operations chain
        System.out.println(newSum2);

        //Returning optional class's object in multiple chaining operations
        List<Integer> emptyList = List.of();
        Optional<Integer> sum = emptyList.stream()
                .reduce((a,b) -> a+b);
        if(sum.isPresent())
            System.out.println(sum.get());
        else System.out.println("Empty list.");
    }

}
