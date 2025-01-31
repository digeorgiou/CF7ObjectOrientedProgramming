package interface_exercise02;

public class Circle extends AbstractShape implements ICircle{
    private double radius;

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return 2*this.radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * 3.14 * this.radius);
    }
}
