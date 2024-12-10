package ProductException;
public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }

    public InvalidPriceException() {
        super("Price need to be bigger than 0 ");
    }
}