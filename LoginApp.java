public class LoginApp {

    public static void main(String[] args) {

        String validUsername = "admin";
        String validPassword = "password123";

        if (args.length < 2) {
            System.out.println("Error: Provide username and password as arguments.");
            System.out.println("Usage: java -jar LoginApp.jar <username> <password>");
            return;
        }

        String username = args[0];
        String password = args[1];

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
