package interfaces.marker;

public class Main {

    public static void main(String[] args) {

        Item book1 = new Book();
        Item cd1 = new CompactDisk();
        Item book2 = new Book();

        deliver(book1);
        deliver(cd1);
        deliver(book1);

    }

    /*polymorphic method
    * Any class that implements Item can be used as parameter
    * using instanceof to check in which class the object belongs
    * */
    public static void deliver(Item item){
    if(item instanceof Book){
        System.out.println("Book delivered");
    }else if (item instanceof CompactDisk){
        System.out.println("CD delivered");
    }else {
        throw new AssertionError(item);
    }
    }
}
