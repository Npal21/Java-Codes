package in.kgcoding;

class A{
    int num = 10;

    public void show(){
        System.out.println("In show A");
    }

    static class B{
        public void show(){
            System.out.println("In show B");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        System.out.println(a.num);

        //For non-static inner class
        //A.B b = a.new B();      //like a.num::: a.new B();
        //b.show();

        //For static inner class
        A.B obj = new A.B();
        obj.show();

    }
}
