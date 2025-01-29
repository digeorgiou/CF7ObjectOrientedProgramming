package inheritance;

public class Rectangle extends Shape{

    /* Rectangle() {
    * super();
    * }*/
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
