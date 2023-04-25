package exception;

public class TaskNotFunctionException extends RuntimeException{

    public TaskNotFunctionException() {
    }

    public TaskNotFunctionException(String message) {
        super(message);
    }

    public TaskNotFunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaskNotFunctionException(Throwable cause) {
        super(cause);
    }

}
