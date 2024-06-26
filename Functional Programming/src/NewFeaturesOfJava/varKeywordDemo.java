package NewFeaturesOfJava;

class Teacher{
    String name;
}

public class varKeywordDemo {
    //var a = 10;   Error outside any method

    public static void main(String... args){
        var a = 10;
        System.out.println(a);

        var b ="Radhe";
        System.out.println(b);

        int c;
        //var d; -> compile-time error

        ////////////////////////////////////

        String var = "Nidhi Pal";
        System.out.println(var);

        ////////////////////////////////////

        int[] nums = new int[10];
        var nums1 = new int[8];

        ////////////////////////////////////
        Teacher t1 = new Teacher();
        var t2 = new Teacher();

    }
}
//class var{} --> compile-time error