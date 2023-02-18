package abductionapi.exception;

/**
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public class NotSupportedException extends CommonException {

    public NotSupportedException(String message) {
        super("The chosen solver doesn't support the following functionality: " + message + ".");
    }
}
