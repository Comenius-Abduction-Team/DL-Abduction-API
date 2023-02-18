package abductionapi.exception;

/**
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public class SymbolAbducibleException extends CommonException {

    public SymbolAbducibleException(Exception ex) {
        super("Solver does not support this type of abducible symbol: ", ex);
    }

    public SymbolAbducibleException(String message) {
        super("Solver does not support this type of abducible symbol: " + message);
    }
}
