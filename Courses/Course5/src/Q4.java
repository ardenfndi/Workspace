/**
 * Q4
 */
public class Q4 {

    // Implement a function that takes a number as input and returns if the number is a prime number or not.    
    // Input: 5
    // Output: true
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        
        for(int i = 2; i <= (int)Math.sqrt(number); i++){
            if(number % i == 0) {
                return false;
            }
        }   
        return true;        
    }

    // Implement a function that takes a number as input and returns the number of prime numbers from 1 to that number.

    public static int countPrimeNumbers(int n){
        int count = 0;

        for (int i = 1; i <= n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        int max = 100;
        int ans = countPrimeNumbers(max);
        System.out.println("Number of prime numbers from 1 to " + max + " is " + ans);
    }
}