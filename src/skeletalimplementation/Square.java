package skeletalimplementation;

/**
 * Δεν χρειάζεται να υλοποιήσουμε το
 * Square αφού το AbstractRectangle
 * παρέχει μία default υλοποίηση
 */
public class Square extends AbstractRectangle implements ISquare{
    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(),2));
    }
}
