package com.example;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Person person))
            return false;

        return person.name.equals(name) &&
                person.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}

class PersonTest{
    public static void main(String[] args) {
        Person p = new Person("Radhe",26);
        Person p1 = new Person("Radhe",26);
        Person p2 = new Person("Radhika",46);

        System.out.println(p.equals(p1));
        System.out.println(p1.equals(p2));


    }
}