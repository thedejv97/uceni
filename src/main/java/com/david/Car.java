package com.david;

public class Car {

    private Brand brand;
    private int doorsCount;
    private String type;
    private FuelType fuelType;
    private double consumptionPer100Km;
    private String model;

    public Car(Brand brand, int doorsCount, String type, FuelType fuelType, double consumptionPer100Km, String model) {
        this.brand = brand;
        this.doorsCount = doorsCount;
        this.type = type;
        this.fuelType = fuelType;
        this.consumptionPer100Km = consumptionPer100Km;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public void setConsumptionPer100Km(double consumptionPer100Km) {
        this.consumptionPer100Km = consumptionPer100Km;
    }
}
