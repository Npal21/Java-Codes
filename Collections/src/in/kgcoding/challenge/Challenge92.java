package in.kgcoding.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge92 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,3,98,47,9);
        System.out.println("Original list: "+list);
        swapElementsByIndices(list,1,3);
        System.out.println(list);
        swapElementsByIndices(list,0,4);
        System.out.println(list);

        //Collections.swap(list, 1,3);

    }

    static void swapElementsByIndices(List<Integer> list, int i1, int i2) {
        int a = list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,a);
    }
}
