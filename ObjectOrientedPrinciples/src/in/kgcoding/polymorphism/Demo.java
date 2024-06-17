package in.kgcoding.polymorphism;

class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}
public class Demo {
    public static void main(String[] args) {

        A a = new A();
        a.show();

        a = new B();    //Reference of superclass and object of subclass
        a.show();

        a = new C();
        a.show();
    }
}
