import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        // Hardcoded username & password (only for demo)
        String validUsername = "admin";
        String validPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}

