package abstractclasses;

/**
 * base class that other classes extend.
 * there can not be instances of this class
 * Abstract classes can contain:
 * implemented methods (materialized methods that can be used or overriden)
 * abstract methods (non-materialized methods that must be overriden).
 * They are made to be inherited.
 */


public abstract class Animal {
    private long id;
    private String name;

    public Animal() {
    }

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id +  "\n" + "Name: " + name;
    }

    public abstract void speak();

    /**
     * The getClass() method is used to obtain the runtime class of an object.
     * It returns an instance of the Class class, which provides methods to inspect the properties
     * of the class, such as its name, superclass, interfaces, constructors, methods, and fields.
     */
    public void eat(){
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }
}
