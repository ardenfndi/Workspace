package UsernameException;

public class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message);
    }

    public UsernameTooShortException() {
        super("Username is too short.");
    }
}