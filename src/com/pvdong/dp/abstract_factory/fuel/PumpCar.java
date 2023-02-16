package com.pvdong.dp.abstract_factory.fuel;

public class PumpCar implements Fuel {
    @Override
    public void pump() {
        System.out.println("The car need oil.");
    }
}
