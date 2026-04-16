package VehicleSystem;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022, 4, "Gasoline");
        car.start();
        car.accelerate(50);
        car.turnOnAirConditioning();
        car.openTrunk();
        car.displayStatus();

        System.out.println();

        Motorcycle bike = new Motorcycle("Yamaha", "MT-15", 2023, false, "Single-cylinder");
        bike.start();
        bike.accelerate(30);
        bike.popWheelie();
        bike.wearHelmetReminder();
        bike.displayStatus();
    }
}
