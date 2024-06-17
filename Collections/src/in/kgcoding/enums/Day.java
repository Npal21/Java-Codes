package in.kgcoding.enums;

import java.sql.SQLOutput;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    Day(boolean day){
        this.isWeekday = day;
    }



    public String describeDay(){
        return isWeekday ? "WeekDay" : "WeekEnd";
    }



}
