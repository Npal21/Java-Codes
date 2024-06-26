package in.kgcoding;

class Z{
    public void show(){
        System.out.println("In show Z");
    }
}
abstract class Y{
    public abstract void show();
    public abstract void config();
}


public class AnonymousInnerClassDemo {
    public static void main(String[] args) {

        Z obj = new Z()     //obj is the object of anonymous inner class and not the object of class Z
        {
            public void show(){
                System.out.println("In newly defined anonymous inner class show Z.");
            }
        };

        obj.show();

        Y y = new Y(){      //y is the object of anonymous inner class and not the object of abstract class Y
            public void show(){
                System.out.println("We can even define abstract class Y in anonymous inner class.");
            }


            public void config() {
                System.out.println("In config method");
            }
        };
        y.show();
        y.config();

    }

}
