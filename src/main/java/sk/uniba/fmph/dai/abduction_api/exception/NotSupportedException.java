package sk.uniba.fmph.dai.abduction_api.exception;

public class NotSupportedException extends CommonException {

    public NotSupportedException(String message) {
        super("The chosen solver doesn't support the following functionality: " + message + ".");
    }
}
