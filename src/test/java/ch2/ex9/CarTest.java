package ch2.ex9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void constructorTest(){
        Car defaultCar = new Car();
        assertEquals(0, defaultCar.getCurrentPosition());
        assertEquals(10, defaultCar.getFuelEfficiency());
        assertEquals(0, defaultCar.getCurrentTankLevel());
        assertEquals(100, defaultCar.getMaxTankVolume());

        Car car = new Car(10);
        assertEquals(10, car.getCurrentPosition());
        assertEquals(10, car.getFuelEfficiency());
        assertEquals(0, car.getCurrentTankLevel());
        assertEquals(100, car.getMaxTankVolume());

        Car car2 = new Car(15.7, 1.0);
        assertEquals(15.7, car2.getCurrentPosition());
        assertEquals(1, car2.getFuelEfficiency());
        assertEquals(0, car2.getCurrentTankLevel());
        assertEquals(100, car2.getMaxTankVolume());

        Car car3 = new Car(4.0, 11, 3);
        assertEquals(4, car3.getCurrentPosition());
        assertEquals(11, car3.getFuelEfficiency());
        assertEquals(3, car3.getCurrentTankLevel());
        assertEquals(100, car3.getMaxTankVolume());
    }

    @Test
    void drivePositiveDistanceTestCurrentPositionChange(){
        Car car = new Car(1);
        car.fill(car.getMaxTankVolume());
        assertEquals(car.getCurrentTankLevel(), car.getMaxTankVolume());
        car.drive(10);
        assertEquals(11, car.getCurrentPosition());
        car.drive(100);
        assertEquals(111, car.getCurrentPosition());
    }

    @Test
    void driveNegativeDistanceTestCurrentPositionChange(){
        Car car = new Car(2);
        car.fill(100);
        car.drive(-1);
        assertEquals(1, car.getCurrentPosition());
        car.drive(-100);
        assertEquals(-99, car.getCurrentPosition());
    }

    @Test
    void drivePositiveDistanceTankLevelChange(){
        Car car = new Car();
        car.fill(1);
        car.drive(10);
        assertEquals(0, car.getCurrentTankLevel());
        assertEquals(10, car.getCurrentPosition());
        car.fill(10);
        assertEquals(10, car.getCurrentTankLevel());
        car.drive(-101);
        assertEquals(0, car.getCurrentTankLevel());
        assertEquals(-90, car.getCurrentPosition());
    }

    @Test
    void fillLessThenMax(){
        Car car = new Car(30.0);
        car.fill(10);
        assertEquals(10, car.getCurrentTankLevel());
    }

    @Test
    void fillMoreThenMax(){
        Car car = new Car(0);
        car.fill(110);
        assertEquals(100, car.getCurrentTankLevel());
    }

    @Test
    void fillNegative(){
        Car car = new Car(30.0);
        car.fill(-10);
        assertEquals(0, car.getCurrentTankLevel());
    }

    @Test
    void equalsTest(){
        Car car = new Car();
        assertTrue(car.equals(new Car()));
        car.fill(10);
        car.drive(1);
        Car otherCar = new Car(1);
        otherCar.fill(car.getCurrentTankLevel());
        assertTrue(car.equals(otherCar));
    }

    @Test
    void constructorExceptionTest() {
        assertThrows(NumberFormatException.class, () -> {
            new Car(12,22, 120, 50);
        });
    }
}