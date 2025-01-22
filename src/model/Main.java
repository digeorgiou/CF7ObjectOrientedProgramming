package model;

/**
 * Δημιουργήστε ένα package με όνομα model
 * και μέσα σε αυτό ορίστε:
 * – Μία κλάση User με πεδία id τύπου Long,
 * firstname τύπου String, lastname τύπου String
 * – Μία κλάση UserCredentials με πεδία id τύπου
 * Long, username τύπου String και password τύπου
 * String
 * • Ορίστε default constructors και overloaded
 * constructors, getters και setters για όλα τα
 * πεδία
 *
 * Σε μία άλλη κλάση με όνομα Main
 * δημιουργήστε ένα instance της κλάσης User
 * και ένα instance της UserCredentials με τη
 * χρήση overloaded constructors
 * • Εμφανίστε με println όλα τα πεδία των δύο
 * instances σε μορφή {πεδίο1, πεδίο2, κλπ.}
 */

public class Main {

    public static void main(String[] args) {


        User jim = new User(24, "Jim", "Smith");
        UserCredentials j = new UserCredentials(24, "jimjim", "12345");

        jim.print();
        j.print();


    }


}
