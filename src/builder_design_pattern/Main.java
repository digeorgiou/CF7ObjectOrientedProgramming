package builder_design_pattern;

/**
 * Το Builder pattern έχει καλύτερο
 * readability όταν έχουμε πολλά πεδία,
 * είναι πιο ευέλικτο γιατί δεν
 * χρειαζόμαστε πολλούς διαφορετικούς
 * constructors, μπορεί να είναι
 * immutable, και διαχωρίζει τα
 * υποχρεωτικά από τα προαιρετικά πεδία
 */

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book.Builder(1,"123").build();

        Book.Builder build2 = new Book.Builder(2, "345");
        build2.author("AB.");
        build2.title("Java");
        Book b2 = build2.build();

        Book b3 =
                new Book.Builder(3,"13145").author("DP").title("Python").build();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
