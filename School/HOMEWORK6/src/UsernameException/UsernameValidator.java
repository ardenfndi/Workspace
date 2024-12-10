package UsernameException;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String userInput = inputScanner.nextLine();

        try {
            checkUsername(userInput);
            System.out.println("Valid username: " + userInput);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public static void checkUsername(String userInput) throws Exception {
        if (userInput == null || userInput.trim().isEmpty()) {
            throw new Exception("Username cannot be left empty.");
        }

        if (userInput.length() < 5) {
            throw new Exception("Username must contain at least 5 characters.");
        }
    }
}
