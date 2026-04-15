package CarInfo;
import java.util.Scanner;
class Car {
    private String brand, model;
    private int speed;

    Car (String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int increase) {
        if (increase > 0) {
            speed += increase;
        }
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + "km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What are the brand would you like? ");
        String brand = scanner.nextLine();
        System.out.print("What are the model would you like? ");
        String model = scanner.nextLine();

        Car car = new Car(brand, model);

        car.accelerate(50);

        car.display();
    }
}
