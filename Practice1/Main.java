package Exceptions.Practice1;

class AndrewExceptions extends Exception {
    public AndrewExceptions (String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            
            if (y == 0) {
                throw new AndrewExceptions("I dont want to divide zero!");
            }

            x = x/y;
            System.out.println("Result: " + x);
        } catch(AndrewExceptions e) {
            System.out.println("Something went wrong... " + e);
        }
    }
}