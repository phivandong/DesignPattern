package com.pvdong.dp.abstract_factory.vehicle;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("The car is running.");
    }

    @Override
    public void stop() {
        System.out.println("The car was stopped.");
    }
}
