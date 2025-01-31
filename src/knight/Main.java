package knight;

public class Main {

    public static void main(String[] args) {

    IKnight joa = new Knight();
    IKnight saintGeorge = new Knight();

    /*Παρατηρούμε πως εχουμε μία ανώνυμη κλαση για την
    αποστολή της joa */
    joa.embarkOnMission(new IMission() {
        @Override
        public void embark() {
            System.out.println("Save the pricess!");
        }
    });

    /*και μία ανώνυμη κλάση για την αποστολή του saintGeorge, μόνο
που εδώ χρησιμοποιούμε μία ήδη υπάρχουσα μέθοδο, την killTheDragon()
*/
    saintGeorge.embarkOnMission(new IMission() {
        @Override
        public void embark() {
            killTheDragon();
        }
    });

    /*Αντί για ανώνυμες κλάσεις, όταν έχουμε Functional
    interfaces, προτιμούμε Lambdas*/

    joa.embarkOnMission(() -> System.out.println("Save me!"));

    saintGeorge.embarkOnMission(() -> killTheDragon());

    /* Αν το callback χρησιμοποιεί μία ήδη υπάρχουσα μέθοδο, τότε
    αντί για lambda μπορούμε να καλέσουμε Method Reference */

        saintGeorge.embarkOnMission(Main::killTheDragon);
    }


    public static void killTheDragon(){
        System.out.println("Kill the dragon");
    }
}
