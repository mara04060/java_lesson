package com.alphabank.work1;

public class Runner {

    public void run(){
        DaysOfWeek[] dayOf = DaysOfWeek.values();
        this.viewDayOfWeek(dayOf);
        System.out.println("Рассписание занятий по дням:");
        this.viewLessonDay();
        String  day = "Saturday";
        System.out.println("После "+day+ " идет " +DaysOfWeek.nextDay(day.toUpperCase()) );

    }

    /**
     * Вывод всех дней недели
     * @param dayOW
     */
    public void viewDayOfWeek(DaysOfWeek[] dayOW){
        for (DaysOfWeek day:dayOW) {
            System.out.println(" День: " + day);
        }
    }

    /**
     * вывод значений дней уроков по Java
     */
    public void viewLessonDay(){
        int i=0;
        for (DaysOfWeek day: DaysOfWeek.values()) {
            switch (day) {
                case MONDAY:
                case THURSDAY:
                case FRIDAY:
                    i++;
                    System.out.println("День : "+i+")" +day);
            }

        }
    }

}
