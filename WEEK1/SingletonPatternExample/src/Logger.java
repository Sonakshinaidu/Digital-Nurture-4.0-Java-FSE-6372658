package WEEK1.SingletonPatternExample.src;

public class Logger {

        // Step 1: Create a private static instance of Logger
        private static Logger instance;

        // Step 2: Private constructor
        private Logger() {
            System.out.println("Logger instance created");
        }

        // Step 3: Public method to return the instance
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Step 4: Method to log messages
        public void log(String message) {
            System.out.println("Log message: " + message);
        }
    }

