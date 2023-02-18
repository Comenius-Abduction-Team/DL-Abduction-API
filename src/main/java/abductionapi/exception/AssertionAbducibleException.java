package abductionapi.exception;

/**
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public class AssertionAbducibleException extends CommonException {

    public AssertionAbducibleException(Exception ex) {
        super("Solver does not support this type of abducible assertion: ", ex);
    }

    public AssertionAbducibleException(String message) {
        super("Solver does not support this type of abducible assertion: " + message);
    }
}
