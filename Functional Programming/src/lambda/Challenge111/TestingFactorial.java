package lambda.Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {

        FactorialUsingProceduralMethod obj1 = new FactorialUsingProceduralMethod();

        int number = 8;
        System.out.println("=============Using Procedural Programming==============");
        System.out.println(obj1.factorial(number));


        System.out.println("=============Using Functional Interface==============");
        FactorialUsingFunctionalInterface method = num -> { //lambda function
            if(num == 0 || num == 1) return 1;
            int result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(method.factorial(number));

        System.out.println("==============Using functional programming=============");
        IntStream.rangeClosed(2,number)
                .reduce((a,b) -> a * b)   //lambda for factorial logic+ returns Optional
                .ifPresent(System.out::println);


    }
}
