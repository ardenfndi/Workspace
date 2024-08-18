import java.lang.reflect.Executable;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message){
        super(message);
    }
    
}
