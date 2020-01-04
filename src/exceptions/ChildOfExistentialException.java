package exceptions;

public class ChildOfExistentialException extends ExistentialException {
    @Override
    public String getMessage() {
        return "or not " + super.getMessage();
    }
}