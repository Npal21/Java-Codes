package in.kgcoding.equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override //I have defined it
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Person))
//            return false;
//
//        Person person = (Person) obj;
//        return person.name.equals(name)
//                && person.age == age
//                && person.id == id;
//    }


    @Override   //ready-made equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
