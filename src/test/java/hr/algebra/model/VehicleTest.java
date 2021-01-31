package hr.algebra.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class VehicleTest {
    @Test
    public void shouldReturnTrueFromMustRefillWhenCapacityIsEqualOrLessThanTen(){
        Car car = new Car(VehicleType.GASOLINE, 10);
        Assertions.assertTrue(car.mustRefill());
    }

    @Test
    public void shouldReturnFalseFromMustRefillWhenCapacityIsGreaterThanTen(){
        Car car = new Car(VehicleType.GASOLINE, 55);
        Assertions.assertFalse(car.mustRefill());
    }
}
