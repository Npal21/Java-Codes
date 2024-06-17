//112.	Write a function that accepts a string
// and returns an Optional<String>. If the string
// is empty or null, return an empty Optional, otherwise,
// return an Optional containing the uppercase
// version of the string.

package lambda.Challenge112;

import java.util.Optional;

public class Challenge112 {
    public static void main(String[] args) {

        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional("radhe-radhe"));

    }

    public static Optional<String> toOptional(String str){
        if(str == null || str.isEmpty())
            return Optional.empty();
        return Optional.of(str.toUpperCase());
    }
}
