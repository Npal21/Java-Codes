package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //diamond operator
        list.add("Ram");
        list.add("Krishna");
        list.add(2,"Hari");

        System.out.println(list);

        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();

        list.add(3,"Radhe");
        list.add("Siya");

        System.out.println("First: "+list.getFirst());
        System.out.println(list.get(1));
        System.out.println("Last: "+list.getLast());
        System.out.println("Class Name: "+list.getClass());

        for (Object o : list)
            System.out.print(o + " ");
        System.out.println();

        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains("Rukmini"));
        System.out.println(list.contains("Radhe"));

        list.set(1,"Hari");
        System.out.println(list);

        list.add(1,"Krishna");
        System.out.println(list);

        System.out.println("indexOf Radhe : "+list.indexOf("Radhe"));

        System.out.println("Size : "+list.size());

        list.clear();
        System.out.println(list);


    }
}
