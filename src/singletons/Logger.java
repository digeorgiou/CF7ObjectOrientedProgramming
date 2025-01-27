package singletons;

import java.time.LocalDateTime;

/**
 * Υλοποιήστε μία Singleton class με όνομα Logger
 * που κάνει log messages στο System.err. Θα
 * πρέπει να περιέχει και μία μέθοδο void
 * logMessage(String message) που εκτυπώνει ένα
 * μήνυμα ακολουθούμενο από ένα timestamp
 */
public class Logger {

    private static final Logger INSTANCE = new Logger();

    private Logger(){}

    public static Logger getInstance(){
    return INSTANCE;
    }

    public void logMessage(String message){
        System.err.println(message);
        System.err.println(LocalDateTime.now());
    }
}

