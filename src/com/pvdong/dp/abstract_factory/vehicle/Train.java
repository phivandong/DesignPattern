package com.pvdong.dp.abstract_factory.vehicle;

public class Train implements Vehicle {
    @Override
    public void run() {
        System.out.println("The train is running.");
    }

    @Override
    public void stop() {
        System.out.println("The train was stopped.");
    }
}
