package StudentRecordSystem;
import java.util.Scanner;
import java.util.HashMap;
class StudentRecord {
    private String name;
    private int age;
    private double grade;

    StudentRecord (String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    double getGrade() {
        return grade;
    } 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many student record you want to display? ");
        int limit = scanner.nextInt();
        scanner.nextLine();

        HashMap<Integer, StudentRecord> map = new HashMap<>();

        for (int i = 0; i < limit; i++) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.print("What is your grade? ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            map.put((i + 1), new StudentRecord(name, age, grade));
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int k : map.keySet()) {
            System.out.println("Student #" + k);
            map.get(k).display();
            System.out.println();
        }

    }
}