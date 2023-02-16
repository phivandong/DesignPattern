package com.pvdong.dp.abstract_factory.fuel;

public class PumpTrain implements Fuel {
    @Override
    public void pump() {
        System.out.println("The train need charcoal.");
    }
}
