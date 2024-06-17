package lambda.FilterAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Cherry","Date","Mango",
                "Blueberry","Pineapple");
        System.out.println(fruits.size());
        System.out.println("====Printing fruits normally====");
        for(String fruit : fruits)
            System.out.println(fruit);

        System.out.println("\n====Printing fruits using streams====");
        System.out.println("First convert list to stream, then add consumer's " +
                "accept as anonymous inner class");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("\n====Printing fruits using streams with lambda====");
        fruits.stream().forEach(fruit -> System.out.println(fruit));

        System.out.println("\n====Printing fruits using " +
                "streams with filter() and lambda====");
        fruits.stream()
                .filter(fruit -> fruit.contains("e"))
                .forEach(fruit -> System.out.println(fruit));

    }
}























