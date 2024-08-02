/**
 * Q1
 */
public class Q1 {   
    // Implement a function that takes an array of integers and returns the reverse of that array.
    // Input: [1, 2, 3, 4, 5]
    // Output: [5, 4, 3, 2, 1]
    
    /*
            50 40 30 20 10
            0  1  2  3  4
               j     i

            


    */
    public static int[] reverseArray(int[] array){
        for(int i = 0, j = array.length-1; i < j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;

        /*
            int[] reversedArray = new int[array.length];
            for(int i = 0, j = array.length-1; i < array.length; i++, j--){
                reversedArray[i] = array[j];
            }
            return reversedArray;
        */
    }

    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArray(arr);
        System.out.println("Reversed Array: " + java.util.Arrays.toString(reversedArr));
    }
}