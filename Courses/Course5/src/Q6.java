import javax.lang.model.util.ElementScanner14;

/**
 * Q6
 */
public class Q6 {

    // Implement both recursive and iterative versions of the factorial function in Java.
    public static int recursiveFactorial(int n) {
        if(n != 0)
            return n * iterativeFactorial(n-1);
        else 
            return 1;
    }

    public static int iterativeFactorial(int n) {
        // 5! = 5*4*3*2*1
        int answer = 1;
        for(int i = 1; i <= n; i++){
            answer *= i;
        }
        return answer;
        
    }


    public static void main(String[] args) {
        System.out.println("Recursive Factorial: " + recursiveFactorial(5));
        System.out.println("Iterative Factorial: " + iterativeFactorial(5));
    }
}