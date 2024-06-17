package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.age > s.age ? 1: -1;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Nidhi"));
        students.add(new Student(100, "Ram"));
        students.add(new Student(41, "Prem"));
        students.add(new Student(30, "Krishna"));
        students.add(new Student(28, "Radhe"));

        Collections.sort(students);
        System.out.println(students);
    }



}
