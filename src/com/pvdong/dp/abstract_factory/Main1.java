package com.pvdong.dp.abstract_factory;

import com.pvdong.dp.abstract_factory.factories.CarFactory;
import com.pvdong.dp.abstract_factory.factories.TrainFactory;
import com.pvdong.dp.abstract_factory.factories.VehicleFactory;
import com.pvdong.dp.abstract_factory.vehicle.Car;
import com.pvdong.dp.abstract_factory.vehicle.Train;

public class Main1 {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory;

        vehicleFactory = new CarFactory();
        Car car = (Car) vehicleFactory.createVehicle();
        car.run();
        car.stop();

        vehicleFactory = new TrainFactory();
        Train train = (Train) vehicleFactory.createVehicle();
        train.run();
        train.stop();
    }
}
