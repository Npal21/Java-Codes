package in.kgcoding.enums;

public class PrintAllDays {
    public static void main(String[] args) {

        System.out.println("All the days of the week: ");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
