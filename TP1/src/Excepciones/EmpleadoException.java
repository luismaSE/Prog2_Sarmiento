package Excepciones;

public class EmpleadoException extends Exception {

    public EmpleadoException() {
        super();
    }

    public EmpleadoException(String message) {
        super(message);
    }

    public EmpleadoException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmpleadoException(Throwable cause) {
        super(cause);
    }
}
