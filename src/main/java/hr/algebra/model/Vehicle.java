package hr.algebra.model;

public abstract class Vehicle{
    private int chargePrice;
    private int capacityPercentage;
    private final VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType, int capacityPercentage) {
        this.vehicleType = vehicleType;
        if (capacityPercentage > 0 && capacityPercentage <= 100)
            this.capacityPercentage = capacityPercentage;
        else throw new IllegalArgumentException("Percentage must be between 0 and 100");
    }

    public int charge() {
        return chargePrice;
    }

    public void setChargePrice(int chargePrice) {
        this.chargePrice = chargePrice;
    }

    public void setCapacityPercentage(int capacityPercentage) {
        this.capacityPercentage = capacityPercentage;
    }

    public int getCapacityPercentage() {
        return capacityPercentage;
    }

    public boolean mustRefill(){
        return capacityPercentage <= 10;
    }

    public void refill(){
        switch (vehicleType){
            case ELECTRIC:
                System.out.println("Batteries recharged to 100%!");
                setCapacityPercentage(100);
                break;
            case LPG:
                System.out.println("LPG tank fully refilled!");
                setCapacityPercentage(100);
                break;
            default:
                System.out.println("Tank fully refilled!");
                setCapacityPercentage(100);
                break;
        }
    }
}
