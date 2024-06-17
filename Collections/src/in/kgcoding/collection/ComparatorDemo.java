package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
   @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<Students> com = new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {

                return s1.name.length() > s2.name.length() ? 1 : -1;
            }
        };

        List<Students> students = new ArrayList<>();
        students.add(new Students(21, "Nidhi"));
        students.add(new Students(100, "Ram"));
        students.add(new Students(41, "Prem"));
        students.add(new Students(30, "Krishna"));
        students.add(new Students(28, "Radhe"));
        students.add(new Students(56, "Balram"));

        Collections.sort(students, com);
        System.out.println(students);
    }


}
