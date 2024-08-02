/**
 * Q5
 */
public class Q5 {

    // Implement a function that takes an array of integers and sorts it in ascending order.

    // [5, 3, 2, 8, 1, 4]
    /*
        



    */

    public static int[] sortArray(int[] arr){
        int n = arr.length;
        boolean swapped;
        
        do {
            swapped = false;
            for(int i = 1; i < n; i++){
                if(arr[i-1] > arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 8, 1, 4 };
        int[] sortedArr = sortArray(arr);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(sortedArr));
    }
}