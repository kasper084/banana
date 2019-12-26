package exceptions;

public class ExceptionB extends ExceptionA {
    @Override
    public String getMessage() {
        return "or not " + super.getMessage();
    }
}