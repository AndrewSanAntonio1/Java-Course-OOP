package VehicleSystem;

public class Vehicle {
    protected String brand, model;
    protected int year;
    protected double speed;
    protected boolean isRunning;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println(brand + " " + model + " is starting.");
    }
    public void stop() {
        isRunning = false;
        speed = 0;
        System.out.println(brand + " " + model + " has stopped.");
    }
    public void accelerate(double amount) {
        if (isRunning) {
            speed += amount;
            System.out.println("Speed increased to " + speed + " km/h");
        } else {
            System.out.println("Start the vehicle first!");
        }
    }
    public void brake(double amount) {
        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
         System.out.println("Speed decreased to " + speed + " km/h");
    }
    
    public void displayStatus() {
        System.out.println(brand + " " + model + " (" + year + ") - Speed: " + speed);
    }
}
