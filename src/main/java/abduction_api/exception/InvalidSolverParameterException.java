package abduction_api.exception;

public class InvalidSolverParameterException extends CommonException {

    public InvalidSolverParameterException(String parameter, String message) {
        super("There was an error parsing the solver parameter '" + parameter + "' caused by: " + message);
    }
}
