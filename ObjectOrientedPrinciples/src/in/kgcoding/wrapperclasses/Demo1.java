package in.kgcoding.wrapperclasses;

public class Demo1 {
    public static void main(String[] args) {

        int n = 19;
        Integer num = new Integer(n);   //boxing: manually primitive datatype to Object
        System.out.println(num);

        num = n;                        //auto-boxing
        System.out.println(num);

        int n1 = num.intValue();        //unboxing: manually Object to primitive datatype
        System.out.println(n1);

        n1 = num;                       //auto-unboxing
        System.out.println(n1);

        String str = "12";
        System.out.println(Integer.parseInt(str)*10);

    }

}
