package lambda.FilterAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,7,4,2,3,6);

        System.out.println("====Printing sum normally====");
        int sum = 0 ;
        for(Integer i : numbers){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("====Printing sum using reduce()====");
        Integer newSum = numbers.stream()
               .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println(newSum);

        System.out.println("====Printing sum using reduce() with lambda====");
        int newSum2 = numbers.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println(newSum2);

        System.out.println("====Printing max number using reduce() with lambda====");
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE , (a,b) -> a > b ? a : b);
        System.out.println(max);


    }
}























