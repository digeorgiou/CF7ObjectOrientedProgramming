package xyz;

/**
 * This class creates a new PointXYZ and tests the methods
 */
public class Main {
    /**
     * The main class
     * @param args The args parameter
     */
    public static void main(String[] args) {

        PointXYZ a = new PointXYZ(1,2,3);

        System.out.println(a.convertToString());

        System.out.println("Distance between X and Y is: " + a.getXYDistance());
        System.out.println("Distance between X and Z is: " +a.getXZDistance());
        System.out.println("Distance between Y and Z is: " +a.getYZDistance());
        System.out.println("Distance between X ,Y and Z is:  " + a.getXYZDistance());

        for(int i = 0; i < 30 ; i++){
            System.out.println(i + ": " + i*1.26);
        }
    }
}
