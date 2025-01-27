package singletons;

/**
 * Υλοποιήστε μία utility class με όνομα
 * MathHelper με public static μεθόδους για
 * κοινές μαθηματικές λειτουργίες όπως εύρεση
 * του μέγιστου, ελάχιστου, και μέσου όρου ενός
 * array από integers
 */
public class MathHelper {

    private MathHelper(){}

    public static int findMax(int[] arr) throws Exception{
        try {
            if (arr.length == 0) {
                throw new Exception("Array is empty");
            }
            int max = arr[0];
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] > max) max = arr[i];
            }
            return max;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int findMin(int[] arr) throws Exception{
        try {
            if (arr.length == 0) {
                throw new Exception("Array is empty");
            }
            int min = arr[0];
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] < min) min = arr[i];
            }
            return min;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int findAverage(int[] arr) throws Exception{
        try {
            if (arr.length == 0) {
                throw new Exception("Array is empty");
            }
            int sum = 0;
            for(int num : arr) {
            sum += num;
            }
            return sum;
        } catch (Exception e) {
            throw e;
        }
    }
}
