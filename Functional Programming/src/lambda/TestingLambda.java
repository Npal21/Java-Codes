package lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda obj = new TestingLambda();
        obj.add(2,5);
        obj.stringToPrint("Radhe Radhe");
//
//        () -> System.out.println("Radhe Shyam");
//        (a,b) -> a+b

    }

    public int add(int a, int b){
        return  a + b;
    }
    public void stringToPrint(String a){
        System.out.println(a);
    }
}
