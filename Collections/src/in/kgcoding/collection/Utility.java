package in.kgcoding.collection;

import java.util.Collection;

public class Utility {
    public static <E> void printCollection(Collection<E> c){
        System.out.print("Collection is: ");
        for (Object o : c) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
}
