package in.kgcoding.challenge;
//Use the Collections class to count the frequency of a particular element in an ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge91 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,12,98,47,47,9,9,9);

        System.out.println("Original list: "+list);
        System.out.println("Frequency of 12 = "+Collections.frequency(list,12));
        System.out.println("Frequency of 9 = "+Collections.frequency(list,9));
        System.out.println("Frequency of 47 = "+Collections.frequency(list,47));
        System.out.println("Frequency of 98 = "+Collections.frequency(list,98));
        System.out.println(Collections.frequency(list,100));        //0


    }
}
