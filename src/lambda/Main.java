package lambda;

/**
 * Αν το interface που περνάει ως παράμετρος είναι functional, τότε
 * μπορούμε να περάσουμε ως πραγματική παράμετρο ένα Lambda
 * Expression που είναι μία συντακτική σύντμηση μίας μεθόδου
 * όπου αριστερά από το -> είναι οι παράμετροι εισόδου η () αν δεν
 * υπάρχουν παράμετροι εισόδου και δεξιά από το -> είναι το σώμα
 * της print() δηλαδή της μεθόδου του interface
 */


public class Main {

    public static void main(String[] args) {

        doPrint(() -> System.out.println("Hello World"));
        doPrint(() -> System.out.println("Hello Coding Factory"));

        //Επειδή οι παράμετροι εισόδου ταιριάζουν με τις παραμέτρους της
        // μεθόδου, μπορούν να εννοηθούν έμμεσα και να χρησιμοποιήσουμε μία
        //συντακτική μορφή που ονομάζεται method reference

        doPrint(Main::sayHelloCoding);
        doPrint(Main::sayHelloWorld);
    }

    public static void doPrint(Printable printable){
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding!");
    }

}
