package xyz;

/**
 * Defines a {@link PointXYZ} that represents a 3-dimensional point.
 * It provides a public API that includes {@link #getXYZDistance()} for
 * getting distance of the point from (0,0,0)
 * and {@link #convertToString()} that converts PointXYZ to string so that we
 * can print its coordinates.
 *
 * @author digeorgiou
 * @version 0.1
 * @since 0.1
 */
public class PointXYZ {
    private double x;
    private double y;
    private double z;

    PointXYZ(){

    }

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * converts coordinates to string
     * @return a formatted string with the coordinates of the point.
     */
    public String convertToString(){
        return ("(" + this.x + ", " + this.y + ", " + this.z + ")");
    }

    public double getXYDistance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double getYZDistance(){
        return Math.sqrt(Math.pow(y,2) + Math.pow(z,2));
    }

    public double getXZDistance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(z,2));
    }

    /**
     * gets the distance of a 3d point from the origin (0,0,0)
     * @return the Euclidean distance of the point to the origin.
     */
    public double getXYZDistance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }


}
