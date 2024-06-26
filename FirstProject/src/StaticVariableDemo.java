class Mobile{
    int price;                       //instance variable
    String brand;                   //instance variable
    static String name;             //static variable: Common copy shared by all the objects

    static{                         //static block: ALWAYS executed before object instantiation
        name = "phone";
        System.out.println("Inside static block");
    }
    public Mobile(){
        System.out.println("Inside constructor");
        brand = "";
        price = 0;
        //name = "phone";       //PROBLEM: Static variable will be initialized with every new object.
                                //SOLUTION: Separate static block
    }

    void display(){
        System.out.println(brand +" : "+price +" : "+name);  //static variable can be accessed inside a non-static method
    }

    static void displayStatic(Mobile m){
        //System.out.println(brand +" : "+price +" : " + name);    //non-static variables cant be used because we dont know its parent object.
        System.out.println("Inside static method");
        System.out.println(m.brand +" : "+m.price +" : "+name);
    }

}


public class StaticVariableDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        Mobile m1 = new Mobile();
        m1.brand = "Realme";
        m1.price = 20000;

        Mobile m2= new Mobile();
        m2.brand = "Nokia";
        m2.price = 30000;

        Mobile.name = "Smartphone";

        m1.display();
        m2.display();

        //NOTE: Whenever an object is created,  2 steps take place:
        //1. Class gets loaded in CLASS LOADER--> that's why, always static block gets executed before constructor and only once.
        //2. Object gets instantiated after that.
        //It means that if object is not created, then class will not be loaded, hence static block wont be executed.
        // Trick to load class without object: Class.forName(String class)

        Class.forName("Mobile");    //Inside static block

        //Static method
        Mobile.displayStatic(m1);
        Mobile.displayStatic(m2);


    }

}
