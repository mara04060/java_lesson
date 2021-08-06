package com.alphabank.work1;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private Integer speed;
    private String mac;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed.equals(that.speed) &&
                mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }

    public EthernetAdapter(String serialNumber, String manufacturer, Double price, Integer speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public Integer getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString(){
        return super.toString() + ", speed=" + this.speed + ", mac="+this.mac;
    }
}
