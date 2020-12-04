package main.logger;

public class ConsoleLogger {

    public static void logMessage(String message) {
        System.out.println("Info: " + message);
    }

    public static void logError(String message, Exception error) {
        System.err.println("Error: " + message + ";" + error);
    }
}
