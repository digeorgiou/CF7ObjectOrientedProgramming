package interface_exercise02;

public class Main {

    public static void main(String[] args){

        Circle c1 = new Circle(1, 2);
        try{
           Circle c2 = c1.clone();

            System.out.println(c1);
            System.out.println(c2);
            c2.setRadius(10);
            System.out.println(c2);
            System.out.println(c1);

        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());;
        }

        System.out.println("----Copy Constructor---");

        Circle c3 = new Circle(c1);

        System.out.println(c3);
        System.out.println(c1.equals(c3));

        Circle c4 = new Circle(1,5);
        System.out.println(c3.equals(c4));

        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }
}
