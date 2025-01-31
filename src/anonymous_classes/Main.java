package anonymous_classes;

/**
 *  Ορίζουμε μία μέθοδο doPrint() που παίρνει ως είσοδο ένα Printable
 * Η doPrint() μπορεί να κληθεί με οποιοδήποτε instance μιας
 * κλάσης που υλοποιεί το Printable
 * Στην main καλούμε την doPrint() περνώντας ως πραγματική παράμετρο ένα
 * instance μίας ανώνυμης κλάσης που υλοποιεί το interface (την μέθοδο print)
 * μέσα στο σώμα της
 */
public class Main {
    public static void main(String[] args) {

        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello Coding Factory");
            }
        });


    }

    public static void doPrint(Printable printable){
        printable.print();
    }
}
