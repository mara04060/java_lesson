package com.alphabank.work3;

public enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static String nextDay(String day){
        int nextDay = DaysOfWeek.valueOf(day).ordinal() +1;
        if(nextDay > 6) {
            nextDay = 0;
        }
        return DaysOfWeek.values()[nextDay].name();

    }

}
