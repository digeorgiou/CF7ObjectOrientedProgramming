package interface_exercise01;

public abstract class AbstractShape implements IShape {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }
}
