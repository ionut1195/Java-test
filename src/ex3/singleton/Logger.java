package ex3.singleton;

public class Logger {
    private static Logger instance;

    // private constructor to prevent instantiation
    private Logger() {}

    // we use a static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
