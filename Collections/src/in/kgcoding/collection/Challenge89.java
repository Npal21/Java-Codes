package in.kgcoding.collection;

public class Challenge89 {

    String concatenateStrings(String... s){
        StringBuilder str = new StringBuilder();
        for(String element : s){
            str.append(element).append(" ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Challenge89 obj = new Challenge89();
        System.out.println(obj.concatenateStrings("Radha","Madhav"));
        String s1 = obj.concatenateStrings("Radha",
                "vallabha","Shri","Harivansha");
        System.out.println(s1);
        String s2 = "Shri Vrindavan";
        String s3 = "Shri Vanchandra";

        System.out.println(obj.concatenateStrings(s1,s2,s3));


    }
}
