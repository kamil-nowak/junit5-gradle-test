public class ReleaseDateException extends RuntimeException {

    public ReleaseDateException(String message) {
        super("Release date no valid: " + message);
    }

}
