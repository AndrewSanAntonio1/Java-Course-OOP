package VehicleSystem;

public class Car extends Vehicle{
    private int numberOfDoors;
    private String fuelType;
    private boolean trunkOpen;
    private boolean acOn;

    public Car(String brand, String model, int year, int numberOfDoors, String fuelType) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.trunkOpen = false;
        this.acOn = false;
    }

    public void openTrunk() {
        trunkOpen = true;
        System.out.println("Trunk is now open.");
    }
    public void closeTrunk() {
        trunkOpen = false;
        System.out.println("Trunk is now closed.");
    }

    public void turnOnAirConditioning() {
        acOn = true;
        System.out.println("Air conditioning is ON.");
    }

    // Overriding accelerate for smoother acceleration
    @Override
    public void accelerate(double amount) {
        if (isRunning) {
            speed += amount * 0.8; // smoother acceleration
            System.out.println("Car smoothly accelerated to " + speed + " km/h");
        } else {
            System.out.println("Start the car first!");
        }
    }
}
