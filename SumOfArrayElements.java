// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SumOfArrayElements {
    public static void main(String[] args) {
        double [] arr = {10, 11};
        double arrSum = countSumRec(arr, arr.length);
        System.out.println("Sum of array elements is: " + arrSum);
    }

    public static double countSumRec(double [] arr, int n){
        if (n <= 0){
            return 0;
        }
        return arr[n-1] + countSumRec(arr, n-1);
    }
}