package lambda.Challenge109;

//109.	Given a list of integers, use stream operations to
// filter odd numbers and print them.

import java.util.List;

public class Challenge109 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,6,8,33,67,3,5,22);
        numbers.stream()
                .filter(num -> num %2 == 1 )
                .forEach(oddNum -> System.out.println(oddNum));

    }
}
