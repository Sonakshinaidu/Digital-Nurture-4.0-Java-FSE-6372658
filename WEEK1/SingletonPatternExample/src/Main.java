package WEEK1.SingletonPatternExample.src;

public class Main {
        public static void main(String[] args) {

            // Get first instance
            Logger logger1 = Logger.getInstance();
            logger1.log("First log message");

            // Get second instance
            Logger logger2 = Logger.getInstance();
            logger2.log("Second log message");

            // Check if both are the same instance
            if (logger1 == logger2) {
                System.out.println("Only one instance of Logger is used (Singleton verified).");
            } else {
                System.out.println("Different instances exist (Singleton failed).");
            }
        }
    }

