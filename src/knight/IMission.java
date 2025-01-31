package knight;

/**
 *  Έστω ότι έχουμε το παράδειγμα ενός Ιππότη που αναλαμβάνει αποστολές
 * Αν έχουμε λοιπόν για τον Ιππότη μία μέθοδο embarkOnMission(IMission) όπου
 * IMission είναι Functional interface, μπορούμε να
 * κάνουμε inject “ανώνυμες αποστολές” στον Ιππότη ως callback functions
 * Βλέπουμε δηλαδή τα functional interfaces ως function objects
 */

@FunctionalInterface
public interface IMission {

    void embark();
}
