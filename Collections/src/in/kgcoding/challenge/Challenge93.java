package in.kgcoding.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge93 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,0,
                98,47,9);
        System.out.println(list);
        reverse(list);
        System.out.println(list);


    }

    public static void reverse(List<Integer> list){
        for(int i=0; i<list.size()/2; i++){

            Challenge92.swapElementsByIndices(list, i, list.size()-1-i);
        }
    }
}
