package RectangleArea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of a rectangle: ");
        double width = scanner.nextDouble();

        Area obj = new Area(length, width);
        double area = obj.getArea();

        System.out.println("Area: " + area);
    }
}
