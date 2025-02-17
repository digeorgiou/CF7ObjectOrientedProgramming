package enums;

public class ActorMain {

    public static void main(String[] args) {

        Actor actor = Actor.STUDENT;

        //ειναι χρησιμο αν σε καποιο framework θελει ειδικη μορφη που
        //γραφουμε τα enums
        System.out.println(actor.toRole());

        //ειναι χρησιμο για αποθηκευση σε βαση δεδομενων
        System.out.println(actor.name());
    }
}
