package com.alphabank.work1;

import java.util.Objects;

public class Device {
    private String serialNumber = "AB1234567CD";
    private String manufacturer = "Samsung";
    private Double price = 120.0;

    public Device(String serialNumber, String manufacturer, Double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getPrice() {
        return price;
    }



    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString(){
        return "class=" + this.getClass().getSimpleName() +
                ": serialNumber=" +this.serialNumber+
                ", manufacturer=" +this.manufacturer+
                ", price="+this.price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return serialNumber.equals(device.serialNumber) &&
                manufacturer.equals(device.manufacturer) &&
                price.equals(device.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, manufacturer, price);
    }
}
