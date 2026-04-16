package VehicleSystem;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    private String engineType;
    private boolean helmetWorn;

    public Motorcycle (String brand, String model, int year, boolean hasSideCar, String engineType) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
        this.engineType = engineType;
        this.helmetWorn = false;
    }

    public void wearHelmetReminder() {
        helmetWorn = true;
        System.out.println("Helmet check: Stay safe!");
    }
    public void popWheelie() {
        if (speed > 20) {
            System.out.println("Motorcycle is doing a wheelie!");
        } else {
            System.out.println("Need more speed to pop a wheelie.");
        }
    }
    public void kickStart() {
        isRunning = true;
        System.out.println("Motorcycle started using kickstart.");
    }

    @Override
    public void start() {
        kickStart();
    }
    @Override
    public void accelerate(double amount) {
        if (isRunning) {
            speed += amount * 1.2;
            System.out.println("Motorcycle accelerated quickly to " + speed + " km/h");
        } else {
            System.out.println("Kickstart the motorcycle first!");
        }
    }
}
