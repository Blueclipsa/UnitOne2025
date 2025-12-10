package Module8Lab1;
/*
    James Quinn
    12/09/2025
    This driver class will simulate logging activity from different threads to validate the functionality of the
    Logger class and demonstrate the Singleton design principle
 */
public class LoggerClient {

    public static void main(String[] args) {

        /*
            Creates threads to test thread safety.
            First argument is a method reference that converts the simulated tasks to a Runnable
            this allows each thread to execute its tasks and log individually.
            The second argument is just the threads name
         */
        Thread uiThread = new Thread(LoggerClient::simulateUI, "UI-Thread");
        Thread dbThread = new Thread(LoggerClient::simulateDatabase, "DB-Thread");
        Thread networkThread = new Thread(LoggerClient::simulateNetwork, "Network-Thread");

        // Start each thread. Each one runs its assigned method on a separate path.
        uiThread.start();
        dbThread.start();
        networkThread.start();

        // Wait for all threads to finish before exiting main().
        try {
            uiThread.join();
            dbThread.join();
            networkThread.join();
        } catch (InterruptedException e) {
            Logger logger = Logger.getInstance();
            logger.log("A thread was interrupted");
        }

        // Demonstrates the logger still works once all threads have finished.
        Logger.getInstance().log("All components finished logging.");
    }

    // Simulated UI behavior
    private static void simulateUI() {
        Logger logger = Logger.getInstance();
        logger.log("UI initialized.");
        pause();

        logger.log("User clicked the Login button.");
        pause();

        logger.log("UI updated to display dashboard.");
    }

    // Simulated Database behavior
    private static void simulateDatabase() {
        Logger logger = Logger.getInstance();
        logger.log("Database connection established.");
        pause();

        logger.log("Query executed: SELECT * FROM users;");
        pause();

        logger.log("Database connection closed.");
    }

    // Simulated Network behavior
    private static void simulateNetwork() {
        Logger logger = Logger.getInstance();
        logger.log("Network request sent to /auth/login.");
        pause();

        logger.log("Response received with status code 200.");
        pause();

        logger.log("Network connection terminated.");
    }

    // Adds a delay so timestamps show time passing and threads interleave naturally
    private static void pause() {
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            Logger logger = Logger.getInstance();
            logger.log("A thread was interrupted");
        }
    }
}