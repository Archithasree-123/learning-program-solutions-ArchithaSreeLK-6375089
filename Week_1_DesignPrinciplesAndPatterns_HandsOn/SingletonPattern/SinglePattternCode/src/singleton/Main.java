package singleton;

public class Main {
    public static void main(String[] args) {
        // Get the Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first message.");

        // Get another Logger instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second message.");

        // Verify if both are same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances exist! Singleton failed.");
        }
    }
}

