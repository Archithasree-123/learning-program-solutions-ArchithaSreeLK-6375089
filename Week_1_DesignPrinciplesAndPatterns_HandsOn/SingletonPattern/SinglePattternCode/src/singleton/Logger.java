package singleton;

public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger singleInstance = null;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Step 3: Public method to provide access to the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Example method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

