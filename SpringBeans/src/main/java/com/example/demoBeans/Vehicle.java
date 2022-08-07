package com.example.demoBeans;

import org.springframework.stereotype.Component;


public class Vehicle {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void carCheck(){
        car.drive();
    }
}
