package in.kgcoding.varargs;

class StringVarargsDemo{
    public void printString(String... elements){
        for (String string : elements) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}

public class VarArgs {

//    public static int sum(int[] a){
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

//    //This also works for zero arguments
//    public static int sum(int... a){
//        int sum=0;
//        for (int i : a) {
//            sum+=i;
//        }
//        return sum;
//    }
    public static int sum(int first, int second, int... a){
        int sum=first+second;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String... args) {
        System.out.println(sum(5,10));      //15
        //System.out.println(sum(new int[]{1,2,3} ));

        System.out.println(sum(3,4,5,6));   //18
        //System.out.println(sum(3)); //3
        //System.out.println(sum());  //0

        System.out.println(sum(3,4,5,6,4,5,6,9));

        StringVarargsDemo sDemo = new StringVarargsDemo();
        sDemo.printString();
        sDemo.printString("Radha");
        sDemo.printString("Radhe","Radhe");
        sDemo.printString("Jai Jai","Ram","Krishna","Hari");
        sDemo.printString(new String[]{"Jai Jai","Ram","Krishna","Hari"});


    }
}

