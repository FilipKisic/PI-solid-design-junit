package hr.algebra.model;

public class Bus extends Vehicle{
    private static final int PRICE = 70;

    public Bus(VehicleType vehicleType, int capacityPercentage) {
        super(vehicleType, capacityPercentage);
        setChargePrice(PRICE);
    }
}
