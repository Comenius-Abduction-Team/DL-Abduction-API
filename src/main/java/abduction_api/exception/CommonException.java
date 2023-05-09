package abduction_api.exception;

public class CommonException extends RuntimeException {

    protected CommonException(){ super(); }

    public CommonException(String message, Exception ex) {
        super(message, ex);
    }

    public CommonException(String message) {
        super(message, null);
    }
}
