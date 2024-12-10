package UsernameException;

public class UsernameEmptyException extends Exception {
    public UsernameEmptyException(String message) {
        super(message);
    }

    public UsernameEmptyException() {
        super("Username is empty.");
        }
    }