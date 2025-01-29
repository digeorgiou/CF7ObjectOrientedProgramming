package inheritance;

/**
 * overridable methods are methods that are public or protected and also
 * non-static , non-final
 */
public class Circle extends Shape{
/*constructors and private parameters are not inhereted*/

    public Circle() {
        super();
    }

    @Override
    /*draw cannot be something less than public, because draw in inhereted
    class is public. (Liskov substitution principle) */
    public void draw(){
        System.out.println("Drawing a circle.");
    }

}
