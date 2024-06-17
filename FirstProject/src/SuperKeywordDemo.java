

class A{
    public A(){
        super();
        System.out.println("In A");
    }
}
class B extends A{
    public B(){
        super();            //Every constructor has it by default as first line.
        System.out.println("In B");
    }

    public B(int n){
        this();     //Calls the default constructor of the same class
        System.out.println("In parameterised B");
    }
}


public class SuperKeywordDemo {
    public static void main(String[] args) {
        B obj = new B();            //In A   -  In B
        System.out.println("=================================================");
            B obj1 = new B(6);          //In A  - In parameterised B
        System.out.println("=================================================");
        B obj2 = new B(10);        //In A   -  In B   -  In parameterised B

    }
}
