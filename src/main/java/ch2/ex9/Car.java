package ch2.ex9;

/**
 * Implement a class Car that models a car traveling along the x-axis, consuming
 * gas as it moves. Provide methods to drive by a given number of
 * miles, to add a given number of gallons to the gas tank, and to get the
 * current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor. Should this be an immutable class?
 * Why or why not?
 */


public class Car{

    private double currentPosition;
    private double currentTankLevel;
    private double maxTankVolume;

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    private double fuelEfficiency; //km/l

    public Car(){
        this.currentPosition = 0;
        this.fuelEfficiency = 10;
        this.currentTankLevel = 0;
        this.maxTankVolume = 100;
    }

    public Car(double currentPosition) {
        this();
        this.currentPosition = currentPosition;
    }

    public Car(double currentPosition, double fuelEfficiency){
        this(currentPosition);
        this.fuelEfficiency = fuelEfficiency;
    }

    public Car(double currentPosition, double fuelEfficiency, double currentTankLevel){
        this(currentPosition, fuelEfficiency);
        if (currentTankLevel > this.maxTankVolume)
            throw new NumberFormatException();
        this.currentTankLevel = currentTankLevel;
    }

    //todo cover by tests
    public Car(double currentPosition, double fuelEfficiency, double currentTankLevel, double maxTankVolume) {
        this(currentPosition, fuelEfficiency, currentTankLevel);
        this.maxTankVolume =  maxTankVolume;
    }

    public double getMaxTankVolume(){
        return maxTankVolume;
    }

    public double getCurrentPosition(){
        return currentPosition;
    }

    public double getCurrentTankLevel(){
        return currentTankLevel;
    }

    public void drive(double distance) {
        boolean positiveDistance = distance >= 0;
        double fuelConsumed = 0.01 / fuelEfficiency;
        double absDistance = Math.abs(distance);
        while (absDistance > 0 && currentTankLevel >= 0) {
            if (positiveDistance) currentPosition += 0.01;
            else currentPosition -= 0.01;
            currentTankLevel -= fuelConsumed;
            absDistance -= 0.01;
            if (currentTankLevel <= 0 ) System.out.println("Tank is empty!");
        }
        currentTankLevel = round(currentTankLevel, 1);
        currentPosition = round(currentPosition, 1);
    }


    public void fill(double liters) {
        if (liters >= 0) {
            if (maxTankVolume >= (currentTankLevel + liters)) {
                currentTankLevel += liters;
            } else {
                double filed = maxTankVolume - currentTankLevel;
                currentTankLevel += filed;
                System.out.println("Tank is full. " + filed + " liters field");
            }
        }
        else {
            System.out.println("Fuel amount can not be negative");
        }
    }

    boolean equals(Car otherCar){
        return (this.currentPosition == otherCar.currentPosition &&
                this.currentTankLevel == otherCar.currentTankLevel &&
                this.fuelEfficiency == otherCar.fuelEfficiency &&
                this.maxTankVolume == otherCar.maxTankVolume);
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }



}
