import java.util.concurrent.CountDownLatch;

/**
 * Q3
 */
public class Q3 {

    // Implement a function that takes an integer as input and returns the number of digits in that integer.
    // Input: 1234
    // Output: 4
    public static int countDigits(int number){
        int counter = 0;
        while (number != 0){
            number /= 10;
            counter++;
        }
        return counter;
        
    }



    public static void main(String[] args) {
        System.out.println(countDigits(1234));
    }
}