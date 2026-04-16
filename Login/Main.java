package Login;
public class Main {
    public static void main(String[] args) {
        String username = "admin";
        String passwordHashed = "admin123";
        Login obj = new Login(username, passwordHashed);

        obj.validate();
    }
}
