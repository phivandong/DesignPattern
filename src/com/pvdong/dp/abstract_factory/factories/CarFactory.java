package com.pvdong.dp.abstract_factory.factories;

import com.pvdong.dp.abstract_factory.vehicle.Car;
import com.pvdong.dp.abstract_factory.vehicle.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
