package abductionapi.exception;

/**
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public class InvalidObservationException extends CommonException {

    public InvalidObservationException(String message) {
        super("Solver does not support this type of observation axiom: " + message);
    }
}
