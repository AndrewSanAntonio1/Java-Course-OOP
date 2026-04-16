package Login;

import java.lang.Thread;
import java.util.Scanner;
public class Login {
    private String username, password;
    
    public Scanner scanner = new Scanner(System.in);
    public Login (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void validate() {
        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String hashedPassword = scanner.nextLine();

        if (user.equals(username) && hashedPassword.equals(password)) { 
            for (int i = 0; i < 4; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 3) {
                    System.out.println("Login Successfully....");
                }
            }
        } else {
            System.out.println("The username or password you entered is incorrect. Please try again.");
        }
    }
}
