package interface_exercise01;

public class Rectangle extends AbstractShape implements ITwoDimensional{
   private double width;
   private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * this.width ;
    }

}
