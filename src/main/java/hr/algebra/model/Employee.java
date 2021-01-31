package hr.algebra.model;

public class Employee {
    private static int idGen = 0;
    private final int id;
    private double salary = 0.0;
    private final int incomePercentage;

    public Employee(int incomePercentage) {
        this.incomePercentage = incomePercentage;
        this.id = ++idGen;
    }

    public void payEmployee(int ticketPrice) {
        this.salary += ticketPrice * (incomePercentage / 100.0);
    }

    public void showSalary() {
        System.out.println("#" + this.id + " Employee salary: " + this.salary);
    }

    public void parkVehicle(Train train, Vehicle vehicle) {
        if (vehicle.mustRefill())
            vehicle.refill();
        train.addVehicle(vehicle);
        System.out.println(vehicle.getClass().getSimpleName() + " loaded on the " + train.getTrainType().toString().toLowerCase() + " train with capacity percentage of " + vehicle.getCapacityPercentage());
    }
}
