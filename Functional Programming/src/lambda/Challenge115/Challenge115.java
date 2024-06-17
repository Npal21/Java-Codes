//115.	Create a list of strings representing numbers ("1", "2", ...).
// Convert each string to an integer, then again calculating squares of
// each number using the map operation and sum up the resulting integers.
package lambda.Challenge115;

import java.util.Arrays;
import java.util.List;


public class Challenge115 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","2","3");
        list.stream()
                .map(Integer::parseInt)     //map(str -> Integer.parseInt(str))
                .map(num -> Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
