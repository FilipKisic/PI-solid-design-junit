package hr.algebra.dal;

import hr.algebra.model.*;

public class VehicleFactory {

    public static Vehicle makeVehicle(String vehicle, VehicleType vehicleType, int capacity) {
        switch (vehicle) {
            case "Car":
                return new Car(vehicleType, capacity);
            case "Van":
                return new Van(vehicleType, capacity);
            case "Bus":
                return new Bus(vehicleType, capacity);
            case "Truck":
                return new Truck(vehicleType, capacity);
            default:
                return null;
        }
    }
}
