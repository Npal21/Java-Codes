package in.kgcoding.collection;

import java.util.Set;
import java.util.HashSet;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Ram");
        set.add("Krishna");
        set.add("Hari");
        Utility.printCollection(set);   //Hari Krishna Ram
        set.add("Radhe");
        set.add("Siya");
        Utility.printCollection(set);   //Hari Krishna Radhe Siya Ram
        System.out.println("Size= "+set.size());

        set.remove("Ram");
        Utility.printCollection(set);

        System.out.println(set.contains("Ram"));    //false
        System.out.println(set.contains("Siya"));   //true

        System.out.println(set.isEmpty());  //false

    }
}
