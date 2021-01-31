package hr.algebra.model;

public class Truck extends Vehicle{
    private static final int PRICE = 90;

    public Truck(VehicleType vehicleType, int capacityPercentage) {
        super(vehicleType, capacityPercentage);
        setChargePrice(PRICE);
    }
}
