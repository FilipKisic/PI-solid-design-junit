package hr.algebra.model;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final TrainType trainType;
    private static final int SMALL_CAPACITY = 8;
    private static final int LARGE_CAPACITY = 6;
    private final int parkingSpaceCapacity;
    private final List<Vehicle> vehicles;

    public Train(TrainType trainType) {
        this.trainType = trainType;
        this.parkingSpaceCapacity = this.trainType == TrainType.LARGE ? LARGE_CAPACITY : SMALL_CAPACITY;
        vehicles = new ArrayList<>(this.parkingSpaceCapacity);
    }

    public void addVehicle(Vehicle vehicle) {
        switch (this.trainType) {
            case LARGE:
                if (vehicles.size() < this.parkingSpaceCapacity && (vehicle instanceof Bus || vehicle instanceof Truck))
                    vehicles.add(vehicle);
                else throw new RuntimeException("Vehicle cannot be parked on this train...");
                break;
            case SMALL:
                if (vehicles.size() < this.parkingSpaceCapacity && (vehicle instanceof Car || vehicle instanceof Van))
                    vehicles.add(vehicle);
                else throw new RuntimeException("Vehicle cannot be parked on this train...");
                break;
        }
    }

    public TrainType getTrainType() {
        return trainType;
    }
}
