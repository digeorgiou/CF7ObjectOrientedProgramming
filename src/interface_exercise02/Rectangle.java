package interface_exercise02;

public class Rectangle extends AbstractShape implements IRectangle{
    private double width;
    private double height;

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public long getCircumference() {
        return (long) (2*height + 2*width);
    }
}
