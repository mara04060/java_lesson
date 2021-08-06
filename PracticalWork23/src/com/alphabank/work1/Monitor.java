package com.alphabank.work1;

import java.util.Objects;

public class Monitor extends Device {
    private Integer resolutionX;
    private Integer resolutionY;

    public Monitor(String serialNumber, String manufacturer, Double price, Integer resolutionX, Integer resolutionY) {
        super(serialNumber, manufacturer, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public Integer getResolutionX() {
        return resolutionX;
    }

    public Integer getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString(){
        return super.toString() + ", resolutionX=" + this.resolutionX + ", resolutionY="+this.resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return getResolutionX().equals(monitor.getResolutionX()) &&
                getResolutionY().equals(monitor.getResolutionY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getResolutionX(), getResolutionY());
    }
}
