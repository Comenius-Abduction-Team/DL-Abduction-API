package abductionapi.exception;

public class InvalidSolverSettingException extends CommonException {

    public InvalidSolverSettingException(String parameter, String message) {
        super("There was an error parsing the solver parameter '" + parameter + "' caused by: " + message);
    }
}
