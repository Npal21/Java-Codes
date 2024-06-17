package in.kgcoding.challenge;

import java.util.*;

//WAP that takes a string & returns the no.of unique
// characters using a Set.
public class Challenge95 {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String myString = sc.next();

//        char[] x = myString.toCharArray();
//        char[] finalArr = new char[50];
//        for(int i=0,j=0; i<x.length; i++){
//            if(x[i] != ' ') {
//                finalArr[j] = x[i];
//                System.out.println(finalArr[j]);
//                j++;
//            }
//        }
//        System.out.println(finalArr);

        for(char c : myString.toCharArray()){
            set.add(c);
        }
        System.out.println("Your string has "+set.size()+" unique elements.");





    }
}
