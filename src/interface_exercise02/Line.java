package interface_exercise02;

public class Line extends AbstractShape implements ILine{

    private double length;

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }
}
