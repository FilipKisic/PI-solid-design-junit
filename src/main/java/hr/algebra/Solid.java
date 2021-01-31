package hr.algebra;

import hr.algebra.dal.VehicleFactory;
import hr.algebra.model.*;

public class Solid {
    private static int income = 0;

    public static void main(String[] args) {
        //factory design pattern
        Vehicle bentley = VehicleFactory.makeVehicle(Car.class.getSimpleName(), VehicleType.GASOLINE, 45);

        Car mercedes = new Car(VehicleType.GASOLINE, 5);
        Van renault = new Van(VehicleType.DIESEL, 65);
        Truck volvo = new Truck(VehicleType.DIESEL, 100);
        Car tesla = new Car(VehicleType.ELECTRIC, 8);
        Bus man = new Bus(VehicleType.LPG, 7);
        Train largeTrain = new Train(TrainType.LARGE);
        Train smallTrain = new Train(TrainType.SMALL);
        Employee standardEmployee = new Employee(10);
        Employee betterEmployee = new Employee(11);

        loadVehicleOnTrain(betterEmployee, smallTrain, tesla);
        loadVehicleOnTrain(standardEmployee, smallTrain, mercedes);
        loadVehicleOnTrain(standardEmployee, largeTrain, man);
        loadVehicleOnTrain(standardEmployee, largeTrain, volvo);
        loadVehicleOnTrain(standardEmployee, smallTrain, renault);
        loadVehicleOnTrain(betterEmployee, smallTrain, bentley);
        System.out.println("Total income: " + income);
        standardEmployee.showSalary();
        betterEmployee.showSalary();
    }

    private static void loadVehicleOnTrain(Employee employee, Train train, Vehicle vehicle) {
        try {
            employee.parkVehicle(train, vehicle);
            employee.payEmployee(vehicle.charge());
            income += vehicle.charge();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
