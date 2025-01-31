package interface_exercise01;

public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

}
