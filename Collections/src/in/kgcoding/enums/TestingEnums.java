package in.kgcoding.enums;

public class TestingEnums {
    public static void main(String[] args) {

        TrafficLight light = TrafficLight.RED;
        light = TrafficLight.GREEN;
        System.out.println(light);

        //ordinal()
        System.out.println(light.ordinal());

        Day day = Day.MONDAY;
        day = Day.FRIDAY;
        System.out.println(day);

        //Converting string to enum using valueOf()
        day = Day.valueOf("MONDAY");
        System.out.println(day);


        //Iterating enums using values()
        System.out.println("========================");
        for (Day value : Day.values()) {
            System.out.println(value + ":" + value.ordinal());
        }
        /*output
        MONDAY:0
        TUESDAY:1
        WEDNESDAY:2
        THURSDAY:3
        FRIDAY:4
        SATURDAY:5
        SUNDAY:6
         */
        System.out.println("========================");
        //Using if() with enums
        Status s = Status.Success;
        if(s == Status.Running)
            System.out.println("Good to go");
        else if(s == Status.Pending)
            System.out.println("Status pending");
        else if(s == Status.Failed)
            System.out.println("OOPS!! Process failed.");
        else
            System.out.println("Done");


        System.out.println("========================");
        //Using switch-case with enums
        switch(s){
            case Running -> System.out.println("Good to go");
            case Pending -> System.out.println("Status pending");
            case Failed -> System.out.println("OOPS!! Process failed.");
            default -> System.out.println("Success!! Task done.");
        }

    }
}
