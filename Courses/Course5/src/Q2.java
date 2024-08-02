/**
 * Q2
 */
public class Q2 {

    // Implement a function that takes a number as parameter and returns the sum of all the digits in the number.
    // Input: 1234
    // Output: 10
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));        
    }
}