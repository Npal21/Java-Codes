package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(6);
        numList.add(-67);
        numList.add(-45);
        numList.add(100);
        Utility.printCollection(numList);

        Collections.sort(numList);
        Utility.printCollection(numList);

        Collections.reverse(numList);
        Utility.printCollection(numList);

        Collections.shuffle(numList);
        Utility.printCollection(numList);

        List<Integer> unmodifiableList = Collections.unmodifiableList(numList);
        //unmodifiableList.add(56);       //UnsupportedOperationException

    }
}
