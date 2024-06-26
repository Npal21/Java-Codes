class Calc{
    public void show(){
        System.out.println("In calc show ");
    }

    public int add(int n1, int n2){
        return n1 +n2;
    }
}

class AdvCalc extends Calc{
    public void show(){
        System.out.println("In show AdvCalc");
    }
    public int add(int n1, int n2){     //redefining old method in child class = overriding
        return n1+n2+1;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        AdvCalc ref = new AdvCalc();
        ref.show();
        System.out.println(ref.add(5,4));

    }
}
