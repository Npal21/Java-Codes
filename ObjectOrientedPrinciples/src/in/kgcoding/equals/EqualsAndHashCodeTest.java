package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {

        Person person1 = new Person("Nidhi",26,001);
        Person person2 = new Person("Nidhi",26,001);

        if(person1 == person2)      // == compares only the references(address) and not the content of the objects
            System.out.println("Equal objects");    //Not equal objects
        else
            System.out.println("Not equal objects");

//         BEFORE OVERRIDING equals()
//        if(person1.equals(person2))      // this default equals() also compares only the addresses and not the objects: override it for expected results
//            System.out.println("Equal objects");    //Not equal objects
//        else
//            System.out.println("Not equal objects");

        //         AFTER OVERRIDING equals()
        if(person1.equals(person2))
            System.out.println("Equal objects");    //Equal objects
        else
            System.out.println("Not equal objects");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

}
