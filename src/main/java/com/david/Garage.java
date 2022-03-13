package com.david;

import java.util.List;

public class Garage {
    List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {

        this.cars.add(car);

    }
}
