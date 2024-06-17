package lambda.Challenge106;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//106.	Write a lambda expression that takes two integers
// and returns their multiplication. Then, apply this lambda
// to a pair of numbers.
public class Challenge106 {
    public static void main(String[] args) {

        //SOLUTION: Passing lambda's value in the variable of a functional interface
        BinaryOperator<Integer> multi = (a , b) -> a * b;
        int product = multi.apply(3,8);
        System.out.println(product);

        //=====================================================
        List<Integer> list = Arrays.asList(2,4,6);

        int prod = list.stream()
                . reduce(1, (a , b) -> a*b);
        System.out.println("Product of all numbers = " + prod);

    }
}
