package com.alphabank.work3;
import java.util.Arrays;

public class Train {
    private int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;
    public DaysOfWeek[] days;

    public Train(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public String getStationDispatch() {
        return stationDispatch;
    }

    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public String getTimeDispatch() {
        return timeDispatch;
    }

    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }


    public DaysOfWeek[] getDays() {
        return this.days;
    }

    public void setDays(DaysOfWeek[] days) {
        this.days = days;
    }

    public boolean searchDay(DaysOfWeek day) {
        for (DaysOfWeek oneDay:days) {
            if(oneDay== day){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", stationDispatch=" + stationDispatch +
                ", stationArrival=" + stationArrival +
                ", timeDispatch=" + timeDispatch +
                ", timeArrival=" + timeArrival  +
                ", days=" + Arrays.toString(days) +
                "}";
    }
}

