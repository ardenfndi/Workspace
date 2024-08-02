import java.util.Scanner;
public class App {
    
    static int factorial(int n) {
        if (n != 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static int sum(int n) {
        // Let user enter a number and then have the sum of the numbers from 0.
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number to calculate the factorial:");
        // int number = scanner.nextInt();
        // int result = factorial(number);
        // System.out.println(number + " factorial is: " + result);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number to calculate:");
        // int number = scanner.nextInt();
        // if (number <= 0) {
        // System.out.println("Please enter a number higher than 0");
        // } else {
        // int result = sum(number);
        // System.out.println("Result is: " + result);
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("How many Fibonacci numbers would you like to see:");
        // int n = scanner.nextInt();

        // if (n <= 0) {
        //     System.out.println("Please enter a number higher than 0");
        // } else {
        //     for (int i = 0; i < n; i++) {
        //         System.out.print(fibonacci(i) + " ");
        //     }
        // }
    }
}
