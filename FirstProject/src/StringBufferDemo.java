public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();       //WE CAN CHANGE THIS "sb" string-It is MUTABLE STRING
        System.out.println(sb.capacity());  //default 16

        sb.append("Ram");
        System.out.println(sb.capacity());  //16

        System.out.println(sb.insert(0,"Sita"));
        System.out.println(sb.capacity());  //16

        System.out.println(sb.append(" Went : for vanvaas for fourteen years on Raja Dashrath's verdict."));
        System.out.println(sb.capacity());  //73-->it increases the capacity by (oldcapacity*2)+2.

        System.out.println(sb.indexOf("Dashrath"));  //52

        System.out.println(sb.delete(13,15));

        StringBuffer sb2 = new StringBuffer("RadheShyam");
        sb2.setLength(30);      //fixed length of data


    }
}
//Advantages over String class
//1. Mutable
//2. Efficient
//3. Thread-safe: StringBuffer objects are thread-safe, which means multiple threads can access it simultaneously
//        ( they can be safely accessed and modified by multiple threads simultaneously)