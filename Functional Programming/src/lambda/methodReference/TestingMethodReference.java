package lambda.methodReference;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,7,4,2,3,6,9,11);

        numbers.stream()
                .filter(num -> num %2 == 1)
                .forEach(System.out::println);

        int newSum2 = numbers.stream()
                .reduce(0, (a,b) -> a+b);

        System.out.println("=====Using method reference to add two integers======");
        newSum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(newSum2);




    }
}























