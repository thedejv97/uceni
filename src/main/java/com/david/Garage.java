package com.david;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Car> cars;
    private Brand brand;

    public Garage(Brand brand, Car car) {
        this.brand = brand;
        this.cars = new ArrayList<>();
        this.cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars count = " + cars.size() +
                ", brand = " + brand +
                '}';
    }
}
