package com.pvdong.dp.abstract_factory.factories;

import com.pvdong.dp.abstract_factory.vehicle.Train;
import com.pvdong.dp.abstract_factory.vehicle.Vehicle;

public class TrainFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Train();
    }
}
