package interface_exercise01;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(3.2);
        Line l1 = new Line(2);
        Rectangle r1 = new Rectangle(3, 2);


        System.out.println(c1.getArea());
        System.out.println(r1.getArea());

        r1.setId(10);
        System.out.println(r1.getId());
    }
}
