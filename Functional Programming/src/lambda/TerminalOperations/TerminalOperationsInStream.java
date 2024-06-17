package lambda.TerminalOperations;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TerminalOperationsInStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,2,5,3,7,8);
        List<String> fruits = List.of("Apple","apple","banana","banana",
                "mango","cherry","cherry");

        //min()
        Optional<Integer> maxNum = numbers.stream()
                            .min(Integer::compareTo);
        maxNum.ifPresent(System.out::println);

        //max()
        Optional<Integer> minNum = numbers.stream()
                                    .max(Integer::compare);
        minNum.ifPresent(System.out::println);

        //collect() -> gathers all the element into a new list
        Set<String> fr = fruits.stream()
                .distinct().collect(Collectors.toSet());
        System.out.println(fr);

    }
}
