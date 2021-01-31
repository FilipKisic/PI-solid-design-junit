package hr.algebra.model;

public class Car extends Vehicle {

    private static final int PRICE = 50;

    public Car(VehicleType vehicleType, int capacityPercentage) {
        super(vehicleType, capacityPercentage);
        setChargePrice(PRICE);
    }
}
