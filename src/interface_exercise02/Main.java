package interface_exercise02;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2);
        Rectangle r1 = new Rectangle(2, 10, 20);
        Line l1 = new Line(3, 5);

        IShape r2 = new Rectangle(4, 5, 6);

        IRectangle r3 = new Rectangle(5,6,6);


        System.out.println(r1.getArea());
        System.out.println(r1.getCircumference());
        System.out.println(r1.getId());

        r1.setId(10);
        System.out.println(r1.getId());

        r3.getArea();
        r3.getCircumference();
    }
}
