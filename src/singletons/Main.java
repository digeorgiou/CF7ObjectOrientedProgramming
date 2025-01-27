package singletons;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.logMessage("Error! Failure");

        int[] arr = new int[] {12, 2, 5 ,23, -2 , 4 , 5, 9};
        int[] arr2 = new int[]{};

        try{
            System.out.println(MathHelper.findMax(arr2));
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }


    }
}
