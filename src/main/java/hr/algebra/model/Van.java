package hr.algebra.model;

public class Van extends Vehicle{

    private static final int PRICE = 80;

    public Van(VehicleType vehicleType, int capacityPercentage) {
        super(vehicleType, capacityPercentage);
        setChargePrice(PRICE);
    }
}
