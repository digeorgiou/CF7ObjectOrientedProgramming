package interface_exercise02;

import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Cloneable{
    private double radius;

    public Circle(long id) {
        super(id);
    }

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    //Copy Constructor
    public Circle(Circle c1){
        this.radius = c1.radius;
        this.setId(c1.getId());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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

    @Override
    public String toString() {
        return "Circle with id: " + super.getId() +"\n" +
                "has radius: " + radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle c = (Circle) obj;
        return (getId() == ((Circle) obj).getId() && radius == ((Circle) obj).radius);
    }

//  too slow (Objects.hash uses Arrays.hashCode()
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getRadius());
//    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + super.hashCode();
        result = prime * result + Double.hashCode(radius);
        return result;
    }
}
